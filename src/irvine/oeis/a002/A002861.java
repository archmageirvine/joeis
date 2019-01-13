package irvine.oeis.a002;

import irvine.oeis.CycleTransformSequence;
import irvine.oeis.a000.A000081;

/**
 * A002861.
 * @author Sean A. Irvine
 */
public class A002861 extends CycleTransformSequence {

  /** Construct the sequence. */
  public A002861() {
    super(new A000081(), 1);
    super.next();
  }
}
