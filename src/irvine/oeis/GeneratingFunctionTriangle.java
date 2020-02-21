/* Generating functions with 2 variables yielding a (lower left) triangle
 * @(#) $Id$
 * 2019-08-25: Constructor for Riordan arrays
 * 2019-07-04, Georg Fischer: copied from GeneratingFunctionSequence
 */
package irvine.oeis;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Generating functions with 2 variables yielding a (lower left) triangle.
 * The coefficients of the numerator and denominator parameter polynomials 
 * as well as the resulting triangle are flattened, 
 * and the linear array elements have "triangle" indexes for <code>[x,y], x=0..maxrow, y=0..ix:
 * [0,0], [1,0],[1,1], [2,0],[2,1],[2,2], [3,0],[3,1],[3,2],[3,3], [4,0] ...</code>
 * Only the coefficients are stored in the input triangles, and the exponents
 * of x,y coincide with the "triangle" indexes.
 * <code>mDen[0]</code> must be +1.
 * @author Georg Fischer
 */
public class GeneratingFunctionTriangle implements Sequence {

  protected ArrayList<Z> mNum; // coefficients of the numerator   polynomial
  protected ArrayList<Z> mDen; // coefficients of the denominator polynomial
  protected int mIndex; // index of next term to be generated
  protected int mTriX; // current triangle index = exponent for x 
  protected int mTriY; // current triangle index = exponent for y

  /**
   * Empty constructor
   */
  protected GeneratingFunctionTriangle() {
  }

  /**
   * Construct a new rational integer polynomial generating function sequence.
   * @param offset first valid term has this index
   * @param num coefficients of numerator   polynomial in triangular order
   * @param den coefficients of denominator polynomial in triangular order
   */
  public GeneratingFunctionTriangle(final int offset, final Z[] num, final Z[] den) {
    mNum = new ArrayList<>(num.length + 128); // will extend in 'next'
    int itri = 0;
    int ix = 0;
    int iy = 0;
    while (itri < num.length) {
      setTri(mNum, ix, iy, num[itri++]);
      ++iy;
      if (iy > ix) {
        ++ix;
        iy = 0;
      }
    } // while num
    while (iy <= ix) { // fill last row with ZEROes
      setTri(mNum, ix, iy++, Z.ZERO);
    }

    mDen = new ArrayList<>(den.length + 8);
    itri = 0;
    ix = 0;
    iy = 0;
    while (itri < den.length) {
      setTri(mDen, ix, iy, den[itri++]);
      ++iy;
      if (iy > ix) {
        ++ix;
        iy = 0;
      }
    } // while den
    while (iy <= ix) { // fill last row with ZEROes
      setTri(mDen, ix, iy++, Z.ZERO);
    }

    mIndex = 0; // assume offset 0
    mTriX = 0;
    mTriY = 0;
    while (mIndex < offset) { // skip over leading coefficients
      next();
      ++mIndex;
    } // while
  } // Constructor

  /**
   * Construct a new rational integer polynomial generating function sequence.
   * @param num coefficients of numerator   polynomial in triangular order
   * @param den coefficients of denominator polynomial in triangular order
   * The offset is assumed to be 0.
   */
  public GeneratingFunctionTriangle(final Z[] num, final Z[] den) {
    this(0, num, den);
  }

  /**
   * Construct the specified generating function.
   * @param num coefficients of numerator   polynomial in triangular order
   * @param den coefficients of denominator polynomial in triangular order
   * The offset is assumed to be 0.
   */
  public GeneratingFunctionTriangle(final long[] num, final long[] den) {
    this(0, ZUtils.toZ(num), ZUtils.toZ(den));
  }

  /**
   * Construct the specified generating function.
   * @param offset first valid term has this index
   * @param num coefficients of numerator   polynomial in triangular order
   * @param den coefficients of denominator polynomial in triangular order
   */
  public GeneratingFunctionTriangle(final int offset, final long[] num, final long[] den) {
    this(offset, ZUtils.toZ(num), ZUtils.toZ(den));
  }

  /**
   * Gets a triangle element.
   * @param triangle linearized array of polynomial coefficients
   * @param ix index/exponent for x
   * @param iy index/exponent for y
   * @return coefficient of monomial <code>x^ix*yîy</code>, or ZERO if the element does not (yet) exist
   */
  protected Z getTri(final ArrayList<Z> triangle, final int ix, final int iy) {
    final int itri = ix * (ix + 1) / 2 + iy;
    Z result = Z.ZERO;
    if (itri < triangle.size()) {
      result = triangle.get(itri);
    }
    return result;
  } // getTri

  /**
   * Sets a triangle element.
   * The array is filled with ZEROes if the desired index does not (yet) exist.
   * @param triangle linearized array of polynomial coefficients
   * @param ix index/exponent for x
   * @param iy index/exponent for y
   * @param coeff coefficient of monomial <code>x^ix*yîy</code>
   */
  protected void setTri(final ArrayList<Z> triangle, final int ix, final int iy, final Z coeff) {
    final int itri = ix * (ix + 1) / 2 + iy;
    if (itri < triangle.size()) {
      triangle.set(itri, coeff);
    } else {
      while (triangle.size() < itri) {
        triangle.add(Z.ZERO);
      }
      triangle.add(coeff);
    }
  } // setTri

  /**
   * Gets the next term of the sequence.
   */
  @Override
  public Z next() {
    final Z result = getTri(mNum, mTriX, mTriY);
    int iDenX = 0;
    int iDenY = 0;
    int iDen = 0;
    while (iDen < mDen.size()) { // process all monomials in denominator
      setTri(mNum, mTriX + iDenX, mTriY + iDenY,
        getTri(mNum, mTriX + iDenX, mTriY + iDenY).subtract(
          getTri(mDen, iDenX, iDenY).multiply(result)
        )
      );
      ++iDenY;
      if (iDenY > iDenX) { // now advance in the triangle
        iDenY = 0;
        ++iDenX;
      } // advance
      iDen = iDenX * (iDenX + 1) / 2 + iDenY;
      // or iDen ++;
    } // while iDen
    ++mTriY;
    if (mTriY > mTriX) { // now advance to next row of the triangle
      mTriY = 0;
      ++mTriX;
      mNum.ensureCapacity(mTriX * (mTriX + 1) / 2);
    } // advance
    return result;
  } // next

//  /**
//   * Test method, shows some fixed triangle with no arguments, or the
//   * sequence resulting from the input parameters.
//   * @param args command line arguments: none for A007318, or
//   * number of terms num_coeffs den_coeff
//   */
//  public static void main(String[] args) {
//    GeneratingFunctionTriangle triangle = new GeneratingFunctionTriangle
//      (0, new long[]{1}, new long[]{1, -1, -1}); // Pascal's triangle A007318: G.f.: 1 / (1-x-x*y).
//    int noTerms = 48;
//    int iarg = 0;
//    if (iarg < args.length) { // with arguments
//      try {
//        noTerms = Integer.parseInt(args[iarg++]);
//      } catch (Exception exc) {
//      }
//      String[] nums = args[iarg++].split("\\,");
//      String[] dens = args[iarg++].split("\\,");
//      long[] num = new long[nums.length];
//      long[] den = new long[dens.length];
//      int itri;
//      for (itri = 0; itri < num.length; itri++) {
//        num[itri] = 0;
//        try {
//          num[itri] = Integer.parseInt(nums[itri]);
//        } catch (Exception exc) {
//        }
//      } // for
//      for (itri = 0; itri < den.length; itri++) {
//        den[itri] = 0;
//        try {
//          den[itri] = Integer.parseInt(dens[itri]);
//        } catch (Exception exc) {
//        }
//      } // for
//      triangle = new GeneratingFunctionTriangle(0, num, den);
//    } // with arguments
//    for (int iterm = 0; iterm < noTerms; iterm++) {
//      System.out.println(iterm + " " + triangle.next().toString());
//    } // for iterm
//  } // main
} // GeneratingFunctionTriangle
