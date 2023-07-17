package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027593 Sequence satisfies T^2(a)=a, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027593 extends A027594 {

  /** Construct the sequence. */
  public A027593() {
    super(1);
  }

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
