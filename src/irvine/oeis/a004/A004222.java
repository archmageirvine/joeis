package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004222 100*log_10 (n) rounded down.
 * @author Sean A. Irvine
 */
public class A004222 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(100.0 * Math.log10(++mN)));
  }
}
