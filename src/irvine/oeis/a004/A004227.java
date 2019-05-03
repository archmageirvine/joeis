package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004227 <code>1000*log_10 (n)</code> rounded up.
 * @author Sean A. Irvine
 */
public class A004227 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(1000.0 * Math.log10(++mN)));
  }
}
