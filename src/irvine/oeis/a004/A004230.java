package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004230 10000*log_10 <code>(n)</code> rounded up.
 * @author Sean A. Irvine
 */
public class A004230 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(10000.0 * Math.log10(++mN)));
  }
}
