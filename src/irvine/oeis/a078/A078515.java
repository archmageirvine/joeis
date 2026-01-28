package irvine.oeis.a078;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a053.A053597;

/**
 * A078515 Numbers n such that A053597(n) sets a new record.
 * @author Sean A. Irvine
 */
public class A078515 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A078515() {
    super(1, 1, new A053597());
  }
}

