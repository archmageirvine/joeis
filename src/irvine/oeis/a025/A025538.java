package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002944;
import irvine.oeis.a003.A003418;

/**
 * A025538 a(n) = (1/s(1) - 1/s(2) + ... + d/s(n+1)) * LCM{1, 2, ..., n}, where d = (-1)^n, s = A002944, i.e., s(k) = LCM of row k of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A025538 extends A002944 {

  /** Construct the sequence. */
  public A025538() {
    super(0);
  }

  private final Sequence mA = new A003418();
  private Q mSum = Q.ZERO;
  private boolean mSign = false;

  @Override
  public Z next() {
    mSign = !mSign;
    mSum = mSum.signedAdd(mSign, new Q(Z.ONE, super.next()));
    return mSum.multiply(mA.next()).toZ();
  }
}
