package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A079726 a(1)=1, a(n) is the smallest integer &gt; a(n-1) such that a(n) is even if k(n)=1, a(n) is odd if k(n)=2, where k(n) denotes the n-th term of the Kolakoski sequence (A000002).
 * @author Sean A. Irvine
 */
public class A079726 extends A000002 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final long k = super.next().longValue() & 1;
    mA = mA.add(1);
    mA = mA.add(mA.testBit(0) == (k == 0) ? 1 : 0);
    return mA;
  }
}

