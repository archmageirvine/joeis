package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000193 Nearest integer to log n.
 * @author Sean A. Irvine
 */
public class A000193 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) (0.5 + Math.log(++mN)));
  }
}

