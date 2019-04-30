package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000494 Nearest integer to <code>sin(n)</code>.
 * @author Sean A. Irvine
 */
public class A000494 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Math.round(Math.sin(++mN)));
  }
}
