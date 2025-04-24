package irvine.oeis.a005;

import irvine.oeis.DifferenceSequence;

/**
 * A005347 First differences of A005579.
 * @author Sean A. Irvine
 */
public class A005347 extends DifferenceSequence {

  /** Construct the sequence. */
  public A005347() {
    super(0, new A005579());
  }
}

