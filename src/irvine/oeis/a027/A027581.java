package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027581 Sequence satisfies T(T(a))=a, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027581 extends A027582 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
