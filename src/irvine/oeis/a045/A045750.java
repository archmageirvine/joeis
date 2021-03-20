package irvine.oeis.a045;

import irvine.math.z.Z;

/**
 * A045750 Extension of Beatty sequence, complement of A045749.
 * @author Sean A. Irvine
 */
public class A045750 extends A045749 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
