package irvine.oeis.a024;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.SkipSequence;

/**
 * A024995.
 * @author Sean A. Irvine
 */
public class A024995 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A024995() {
    super(new SkipSequence(new A024994(), 3), 4);
  }
}
