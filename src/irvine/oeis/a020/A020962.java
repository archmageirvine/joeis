package irvine.oeis.a020;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a080.A080039;

/**
 * A020962.
 * @author Sean A. Irvine
 */
public class A020962 extends PartialSumSequence {

  /** Construct the sequence. */
  public A020962() {
    super(new A080039());
  }
}
