package irvine.oeis.a004;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a038.A038548;

/**
 * A004778 Where records occur in A038548.
 * @author Sean A. Irvine
 */
public class A004778 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A004778() {
    super(1, new A038548(), 1);
  }
}

