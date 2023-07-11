package irvine.oeis.a055;

import irvine.oeis.a000.A000041;
import irvine.oeis.transform.CycleTransformSequence;

/**
 * A055890 CIK transform of partition numbers A000041.
 * @author Sean A. Irvine
 */
public class A055890 extends CycleTransformSequence {

  /** Construct the sequence. */
  public A055890() {
    super(0, new A000041(), 1);
  }
}
