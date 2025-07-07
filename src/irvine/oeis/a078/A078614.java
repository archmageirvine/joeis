package irvine.oeis.a078;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a072.A072633;

/**
 * A078614 First differences of A072633.
 * @author Sean A. Irvine
 */
public class A078614 extends DifferenceSequence {

  /** Construct the sequence. */
  public A078614() {
    super(1, new A072633());
  }
}

