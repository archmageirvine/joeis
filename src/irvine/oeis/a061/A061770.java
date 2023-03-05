package irvine.oeis.a061;

import irvine.oeis.PrependSequence;
import irvine.oeis.RecordPositionSequence;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061770 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A061770() {
    super(new PrependSequence(new A061768(), 0), 0);
  }
}
