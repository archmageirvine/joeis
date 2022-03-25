package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a000.A000013;

/**
 * A056295 Number of n-bead necklace structures using exactly two different colored beads.
 * @author Georg Fischer
 */
public class A056295 extends A000013 {

  /** Construct the sequence. */
  public A056295() {
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
