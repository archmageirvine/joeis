package irvine.oeis.a085;
// manually 2021-06-16

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A085748 G.f.: 1/(1-G001190), where G001190 = x + x^2 + x^3 + 2x^4 + 3x^5 + ... is the g.f. for the Wedderburn-Etherington numbers A001190.
 * a(n) = binomial(A053644(n),n-A053644(n)).
 * @author Georg Fischer
 */
public class A085748 implements Sequence {

  private int mN;
  private ArrayList<Z> mA;
  private ArrayList<Z> mB;
  
  /** Construct the sequence */
  public A085748() {
    mN = -1;
    mA = new ArrayList<>();
    mB = new ArrayList<>();
    mA.add(Z.ONE);  // a(0)=1
    mB.add(Z.ZERO); // b(0)=0
    mB.add(Z.ONE);  // b(1)=1
  }

/*
b:= proc(n) option remember; `if`(n<2, n, `if`(n::odd, 0,
      (t-> t*(1-t)/2)(b(n/2)))+add(b(i)*b(n-i), i=1..n/2))
    end:
a:= proc(n) option remember; `if`(n<1, 1,
      add(a(n-i)*b(i), i=1..n))
    end:
seq(a(n), n=0..25);  # Alois P. Heinz, Sep 07 2017
*/

  /**
   * Mapping t
   * @param parm parameter
   */
  private Z t(final Z parm) {
    return parm.multiply(Z.ONE.subtract(parm)).divide2();
  }

  @Override
  public Z next() {
    ++mN;
    Z result = Z.ONE;
    if (mN >= 1) {
      if (mN >= 2) { // compute next b
        Z sum = Z.ZERO;
        final int nh = mN >> 1;
        if ((mN & 1) == 0) { // even
          sum = t(mB.get(nh));
        }
        for (int i = 1; i <= nh; ++i) {
          sum = sum.add(mB.get(mN - i).multiply(mB.get(i)));
        }
        mB.add(sum);
      } // next b
      Z sum = Z.ZERO;
      for (int i = 1; i <= mN; ++i) {
        sum = sum.add(mA.get(mN - i).multiply(mB.get(i)));
      }
      mA.add(sum);
      result = sum;
    }
    // System.out.println("a(" + mN + ")=" + mA.get(mN) + ", b=" + mB.get(mN));
    return result;
  }
}
