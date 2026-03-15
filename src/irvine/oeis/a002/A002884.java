package irvine.oeis.a002;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A002884 Number of nonsingular n X n matrices over GF(2) (order of the group GL(n,2)); order of Chevalley group A_n (2); order of projective special linear group PSL_n(2).
 * @author Sean A. Irvine
 */
public class A002884 extends AbstractSequence implements DirectSequence {

  /** Construct the sequence. */
  public A002884() {
    super(0);
  }

  protected int mN = -1;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mP = mP.multiply(Z.ONE.shiftLeft(mN).subtract(1));
    }
    return mP.shiftLeft(((long) mN * mN - mN) / 2);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    // a(n) = Product_{i=0..n-1} (2^n-2^i).
    final Z n2 = Z.TWO.pow(n);
    return Integers.SINGLETON.product(0, n - 1, i -> n2.subtract(Z.TWO.pow(i)));
  }

}
