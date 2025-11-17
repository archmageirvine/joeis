package irvine.oeis.a081;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003418;

/**
 * A081887 Numbers k such that lcm(1..k) equals the denominator of the sum of the first k harmonic numbers.
 * @author Sean A. Irvine
 */
public class A081887 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();
  private final Sequence mB = new A003418().skip(); // lcm
  private long mN = 0;
  private Q mS = Q.ZERO;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mS = mS.add(mH.nextQ());
      if (mS.den().equals(mB.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
