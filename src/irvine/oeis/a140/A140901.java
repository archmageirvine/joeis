package irvine.oeis.a140;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A140901 Number of 3 X 5 matrices with elements in 0..n with each row and each column in nondecreasing order. 3,5,n can be permuted, see formula.
 * 3, 5,n can be permuted, see formula.
 * @author Georg Fischer
 */
public class A140901 extends HolonomicRecurrence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A140901() {
    this(0, 5, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param rows number of matrix rows
   * @param cols number of matrix columns
   */
  public A140901(final int offset, final int rows, final int cols) {
    super(offset, new ArrayList<>(), new Z[] {Z.ONE}, 0);
    mPolyList.add(new Z[] {Z.ZERO});
    /* new A140907(7, 3) => -1/n/(n+1)/(n+2)*(n+7)*(n+8)*(n+9) 
                           <////-a(n)/////> <****-a(n-1)****> 
       expand((n+7)*(n+8)*(n+9)) = n^3+24*n^2+191*n+504
       MATRIX="[[0],[-504,-191,-24,-1],[0, 2, 3, 1]]
    */
    Polynomial<Z> an1 = RING.monomial(Z.NEG_ONE, 1);
    for (int r = rows; r < rows + cols; ++r) {
      an1 = RING.multiply(an1, Polynomial.create(r, 1)); // (n+7)*(n+8)*(n+9)*...
    }
    final Z[] an1z = new Z[an1.degree()];
    for (int i = 1; i <= an1.degree(); ++i) {
      an1z[i - 1] = an1.coeff(i);
    }
    mPolyList.add(an1z);

    Polynomial<Z> an0 = RING.monomial(Z.ONE, 1);
    for (int c = 0; c < cols; ++c) {
      an0 = RING.multiply(an0, Polynomial.create(c, 1)); // (n+0)*(n+1)*(n+2)*...
    }
    final Z[] an0z = new Z[an0.degree()];
    for (int i = 1; i <= an0.degree(); ++i) {
      an0z[i - 1] = an0.coeff(i);
    }
    mPolyList.add(an0z);
    initialize();
  }

  /**
   * Main method.
   * @param args command line arguments: rows, cols
   */
  public static void main(final String[] args) {
    int iarg = 0;
    int rows = 7;
    int cols = 3;
    if (args.length > 0) {
      try {
        rows = Integer.parseInt(args[iarg++]);
        cols = Integer.parseInt(args[iarg++]);
      } catch (final Throwable exc) { // silently assume defaults
      }
    }
    final A140901 seq = new A140901(0, rows, cols);
    System.out.println("make runholo MATRIX=\"" + seq.getPolyString() + "\" INIT=\"" + seq.getInitString() + "\"");
    for (int i = 0; i < 16; ++i) {
      System.out.print(seq.next() + ", ");
    }
    System.out.println();
  } // main
}
