package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004223 100*log_10 <code>(n)</code> rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A004223 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Math.round(100.0 * Math.log10(++mN)));
  }
}
