package irvine.oeis.a006;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A006353.
 * @author Sean A. Irvine
 */
public class A006353 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A006353() {
    super(new PeriodicSequence(5, -2, -2, -2, 5, -4), 0);
  }
}

