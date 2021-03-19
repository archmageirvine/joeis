package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045682 Extension of Beatty sequence; complement of A045681.
 * @author Sean A. Irvine
 */
public class A045682 extends A045681 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
