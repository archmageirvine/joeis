package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000494 Nearest integer to sin(n).
 * @author Sean A. Irvine
 */
public class A000494 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Math.round(Math.sin(++mN)));
  }
}
