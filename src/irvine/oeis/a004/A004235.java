package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004235 a(n) = 10*log(n) rounded to the nearest integer.
 * @author Sean A. Irvine
 */
public class A004235 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Math.round(10.0 * Math.log(++mN)));
  }
}
