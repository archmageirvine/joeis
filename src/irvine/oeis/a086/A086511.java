package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A086511 a(n) is the smallest integer k &gt; 1 such that k &gt; n * pi(k), where pi() denotes the prime counting function.
 * @author Sean A. Irvine
 */
public class A086511 extends Sequence1 {

  private final Sequence mS = new A000720().skip();
  private long mN = 0;
  private long mM = 2;
  private Z mPi = mS.next();

  @Override
  public Z next() {
    ++mN;
    while (mPi.multiply(mN).compareTo(mM) >= 0) {
      ++mM;
      mPi = mS.next();
    }
    return Z.valueOf(mM);
  }
}

