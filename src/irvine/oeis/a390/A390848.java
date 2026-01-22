package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a389.A389544;

/**
 * A390848 Complement of A389544.
 * @author Sean A. Irvine
 */
public class A390848 extends ComplementSequence {

  /** Construct the sequence. */
  public A390848() {
    super(1, Z.ONE, new A389544());
  }
}

