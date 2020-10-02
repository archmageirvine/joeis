package irvine.oeis.a035;

import irvine.oeis.PositionOfNSequence;

/**
 * A035237 Smallest number that has n substrings which are square.
 * @author Sean A. Irvine
 */
public class A035237 extends PositionOfNSequence {

  // Could prepend 3 here by starting at 0 rather than 1

  /** Construct the sequence. */
  public A035237() {
    super(new A035222(), 0);
  }
}

