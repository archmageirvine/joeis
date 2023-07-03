package irvine.oeis.a006;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a000.A000793;

/**
 * A006644 Indices of records in Landau's function A000793.
 * @author Sean A. Irvine
 */
public class A006644 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A006644() {
    super(1, new A000793(), 0);
  }
}
