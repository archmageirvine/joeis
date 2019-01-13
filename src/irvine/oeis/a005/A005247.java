package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000045;

/**
 * A005247.
 * @author Sean A. Irvine
 */
public class A005247 implements Sequence {

  private final Sequence mLucas = new A000032();
  private final Sequence mFibo = new A000045();
  private boolean mSide = false;

  @Override
  public Z next() {
    mSide = !mSide;
    final Z lucas = mLucas.next();
    final Z fibo = mFibo.next();
    return mSide ? lucas : fibo;
  }
}
