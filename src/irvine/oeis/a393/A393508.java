package irvine.oeis.a393;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a038.A038575;

/**
 * A393508 Indices of records in A038575.
 * @author Sean A. Irvine
 */
public class A393508 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A393508() {
    super(1, 0, new A038575());
  }
}
