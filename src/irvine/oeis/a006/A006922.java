package irvine.oeis.a006;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A006922.
 * @author Sean A. Irvine
 */
public class A006922 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A006922() {
    super(new PeriodicSequence(24), 0);
  }
}
