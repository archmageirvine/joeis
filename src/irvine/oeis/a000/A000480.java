package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000480 a(n) = floor(cos(n)).
 * @author Sean A. Irvine
 */
public class A000480 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(Math.cos(++mN)));
  }
}
