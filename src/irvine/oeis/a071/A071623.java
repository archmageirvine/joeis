package irvine.oeis.a071;

import irvine.oeis.InverseSequence;

/**
 * A071623 Least k such that n = A071532(k).
 * @author Sean A. Irvine
 */
public class A071623 extends InverseSequence {

  /** Construct the sequence. */
  public A071623() {
    super(1, 1, new A071532());
  }
}
