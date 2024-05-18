package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a056.A056600;

/**
 * A069718 C referred to in A056600.
 * @author Sean A. Irvine
 */
public class A069718 extends A056600 {

  @Override
  protected Z select(final Z a, final Z b, final Z c) {
    return c;
  }
}

