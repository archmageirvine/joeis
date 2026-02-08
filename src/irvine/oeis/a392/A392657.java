package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A392657 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A392657 extends A392117 {

  /** Construct the sequence. */
  public A392657() {
    super(new A000290());
  }

  @Override
  protected Z select(final Z lower, final Z upper) {
    return upper;
  }
}
