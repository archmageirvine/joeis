package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A048108 Numbers with at least as many non-unitary divisors (A048105) as unitary divisors (A034444).
 * @author Sean A. Irvine
 */
public class A048108 extends ComplementSequence {

  /** Construct the sequence. */
  public A048108() {
    super(new A048107(), Z.ONE);
  }
}
