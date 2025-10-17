package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.a152.A152004;

/**
 * A389258 allocated for Piotr Gardocki.
 * @author Sean A. Irvine
 */
public class A389258 extends A152004 {

  @Override
  protected Z select(final long p, final long r) {
    return Z.valueOf(r);
  }
}
