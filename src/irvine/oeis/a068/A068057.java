package irvine.oeis.a068;

import irvine.oeis.DifferenceSequence;

/**
 * A068057 First differences of A068056.
 * @author Sean A. Irvine
 */
public class A068057 extends DifferenceSequence {

  /** Construct the sequence. */
  public A068057() {
    super(1, new A068056());
  }
}

