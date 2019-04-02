package irvine.oeis.a005;

import irvine.oeis.Stirling2TransformSequence;
import irvine.oeis.a000.A000311;

/**
 * A005804 Number of phylogenetic rooted trees with n labels.
 * @author Sean A. Irvine
 */
public class A005804 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A005804() {
    super(new A000311(), 0);
    next();
  }
}
