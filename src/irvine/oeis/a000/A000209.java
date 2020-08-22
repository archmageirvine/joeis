package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000209 Nearest integer to tan n.
 * @author Sean A. Irvine
 */
public class A000209 implements Sequence {

  private static final double TOLERANCE = 0.000000001;
  private long mN = -1;

  @Override
  public Z next() {
    final double t = Math.tan(++mN);
    final double r = Math.abs(t % 1);
    if (0.5 - TOLERANCE < r && r < 0.5 + TOLERANCE) {
      throw new UnsupportedOperationException(String.valueOf(mN));
    }
    return Z.valueOf(Math.round(t));
  }
}

