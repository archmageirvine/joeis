package irvine.oeis.a052;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a025.A025441;

/**
 * A052199 Numbers that are expressible as the sum of 2 distinct positive squares in more ways than any smaller number.
 * @author Sean A. Irvine
 */
public class A052199 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A052199() {
    super(new SkipSequence(new A025441(), 1), 1);
  }
}
