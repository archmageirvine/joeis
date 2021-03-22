package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045775 Extension of Beatty sequence; complement of A045774.
 * @author Sean A. Irvine
 */
public class A045775 extends A045774 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
