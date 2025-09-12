package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A074138 Numbers which are not members of A074137.
 * @author Sean A. Irvine
 */
public class A074138 extends ComplementSequence {

  /** Construct the sequence. */
  public A074138() {
    super(1, Z.ONE, new A074137());
  }
}
