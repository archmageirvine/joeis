package irvine.oeis.a068;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a061.A061398;

/**
 * A066926.
 * @author Sean A. Irvine
 */
public class A068360 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A068360() {
    super(1, 1, new A061398(), ZERO);
  }
}
