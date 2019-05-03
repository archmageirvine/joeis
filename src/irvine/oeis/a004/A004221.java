package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004221 <code>10*log_10 (n)</code> rounded up.
 * @author Sean A. Irvine
 */
public class A004221 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(10.0 * Math.log10(++mN)));
  }
}
