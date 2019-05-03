package irvine.oeis.a014;

import irvine.oeis.ComplementSequence;

/**
 * A014134 Numbers that are not the sum of a square <code>(A000290)</code> and a triangular number <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A014134 extends ComplementSequence {

  /** Construct the sequence. */
  public A014134() {
    super(new A014133());
  }
}
