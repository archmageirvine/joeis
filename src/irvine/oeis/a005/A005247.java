package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000045;

/**
 * A005247 <code>a(n) = 3*a(n-2) - a(n-4), a(0)=2, a(1)=1, a(2)=3, a(3)=2</code>. Alternates Lucas <code>(A000032)</code> and Fibonacci <code>(A000045)</code> sequences for even and odd n.
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
