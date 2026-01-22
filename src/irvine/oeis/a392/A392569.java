package irvine.oeis.a392;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000788;

/**
 * A392569 allocated for George Lamont.
 * @author Sean A. Irvine
 */
public class A392569 extends PartialSumSequence {

  /** Construct the sequence. */
  public A392569() {
    super(0, new A000788());
  }
}
