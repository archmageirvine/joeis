package irvine.oeis.a391;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a094.A094345;

/**
 * A391637 allocated for George Lamont.
 * @author Sean A. Irvine
 */
public class A391637 extends PartialSumSequence {

  /** Construct the sequence. */
  public A391637() {
    super(0, new A094345());
  }
}
