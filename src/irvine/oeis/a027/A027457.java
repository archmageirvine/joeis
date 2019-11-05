package irvine.oeis.a027;

import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A027457 <code>a(n) = (H(n) - 1)*lcm{1,...,n}</code>, where <code>H(n)</code> is the n-th harmonic number.
 * @author Sean A. Irvine
 */
public class A027457 extends A003418 {

  private final HarmonicSequence mH = new HarmonicSequence();
  {
    super.next();
  }

  @Override
  public Z next() {
    return mH.nextQ().subtract(1).multiply(super.next()).toZ();
  }
}
