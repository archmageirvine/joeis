package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004216 a(n) = floor(log_10(n)).
 * @author Sean A. Irvine
 */
public class A004216 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(Math.log10(++mN)));
  }
}
