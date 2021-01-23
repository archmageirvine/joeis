package irvine.oeis.a011;

import irvine.oeis.PeriodicSequence;

/**
 * A011659 A binary m-sequence: expansion of reciprocal of x^4+x+1.
 * @author Sean A. Irvine
 */
public class A011659 extends PeriodicSequence {

  /** Construct the sequence. */
  public A011659() {
    super(0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1);
  }
}
