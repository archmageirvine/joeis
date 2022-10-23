package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000493 a(n) = floor(sin(n)).
 * @author Sean A. Irvine
 */
public class A000493 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(Math.sin(++mN)));
  }
}
