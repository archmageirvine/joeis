package irvine.oeis.a001;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000166;

/**
 * A001277 Number of permutations of length n by rises.
 * @author Sean A. Irvine
 */
public class A001277 extends PartialSumSequence {

  private static Sequence under() {
    final Sequence s = new A000166();
    s.next();
    s.next();
    return s;
  }

  /** Construct the sequence. */
  public A001277() {
    super(2, under());
  }
}
