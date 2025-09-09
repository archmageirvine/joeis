package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035417 First differences of A035407.
 * @author Sean A. Irvine
 */
public class A035417 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035417() {
    super(new A035407());
  }
}

