package irvine.oeis.a022;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a004.A004999;

/**
 * A022555 Positive integers that are not the sum of two nonnegative cubes.
 * @author Sean A. Irvine
 */
public class A022555 extends ComplementSequence {

  /** Construct the sequence. */
  public A022555() {
    super(new A004999());
  }
}

