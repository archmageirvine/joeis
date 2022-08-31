package irvine.oeis.a262;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a071.A071904;

/**
 * A262044 Partial sum of the first n odd composite numbers.
 * @author Sean A. Irvine
 */
public class A262044 extends PartialSumSequence {

  /** Construct the sequence. */
  public A262044() {
    super(new A071904());
  }
}
