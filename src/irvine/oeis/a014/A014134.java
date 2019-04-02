package irvine.oeis.a014;

import irvine.oeis.ComplementSequence;

/**
 * A014134 Numbers that are not the sum of a square (A000290) and a triangular number (A000217).
 * @author Sean A. Irvine
 */
public class A014134 extends ComplementSequence {

  /** Construct the sequence. */
  public A014134() {
    super(new A014133());
  }
}
