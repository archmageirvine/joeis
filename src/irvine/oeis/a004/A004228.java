package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004228 10000*log_10 <code>(n)</code> rounded down.
 * @author Sean A. Irvine
 */
public class A004228 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(10000.0 * Math.log10(++mN)));
  }
}
