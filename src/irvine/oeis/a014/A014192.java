package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.UnionSequence;
import irvine.oeis.a048.A048703;

/**
 * A014192 Palindromes in base 4 (written in base 10).
 * @author Sean A. Irvine
 */
public class A014192 extends UnionSequence {

  /** Construct the sequence. */
  public A014192() {
    super(new A048703(), new Sequence0() {
      private String mForward = "";
      private StringBuilder mReverse = new StringBuilder();
      private long mN = 0;
      private int mM = 0;

      @Override
      public Z next() {
        if (++mM > 3) {
          mForward = Long.toString(++mN, 4);
          mReverse = new StringBuilder(mForward).reverse();
          mM = 0;
        }
        return new Z(mForward + mM + mReverse, 4);
      }
    });
  }
}
