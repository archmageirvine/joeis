package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027596 Sequence satisfies T^2(a)=a, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027596 extends A027595 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
