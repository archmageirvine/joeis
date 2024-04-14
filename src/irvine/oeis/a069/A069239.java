package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;

/**
 * A069239 Denominator of coefficient G_n defined by Sum_{ (m,m') != (0,0)} 1/(m+m'*sqrt(-2))^(2*n) = (4*w)^(2*n)*G_n/(2*n)!, where 2w is one of the periods of the associated Weierstrass P-function.
 * @author Sean A. Irvine
 */
public class A069239 extends PrependSequence {

  private static final Z NEG_TWO = Z.valueOf(-2);

  /** Construct the sequence. */
  public A069239() {
    super(1, new A069182() {

      private long mN = 1;

      @Override
      public Z next() {
        return new Q(super.next().multiply(2 * ++mN), Z.ONE.shiftLeft(2 * mN - 1).multiply(NEG_TWO.pow(mN).subtract(1))).den();
      }
    }.skip(), 3, 3);
  }
}

