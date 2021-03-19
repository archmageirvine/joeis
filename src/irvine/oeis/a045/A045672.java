package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045672 Extension of Beatty sequence; complement of A045671 (apart from the initial 0).
 * @author Sean A. Irvine
 */
public class A045672 extends A045671 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
