package irvine.oeis.a014;

import irvine.oeis.ComplementSequence;

/**
 * A014158 Numbers that are not the sum of 2 cubes and a triangular number.
 * @author Sean A. Irvine
 */
public class A014158 extends ComplementSequence {

  /** Construct the sequence. */
  public A014158() {
    super(new A014157());
  }
}
