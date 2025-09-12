package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A073492 Numbers having at least one prime gap in their factorization.
 * @author Sean A. Irvine
 */
public class A073492 extends ComplementSequence {

  /** Construct the sequence. */
  public A073492() {
    super(1, Z.ONE, new A073491());
  }
}
