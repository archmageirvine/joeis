package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a056.A056600;

/**
 * A068418.
 * @author Sean A. Irvine
 */
public class A069717 extends A056600 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}

