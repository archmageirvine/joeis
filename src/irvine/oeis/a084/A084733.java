package irvine.oeis.a084;

import irvine.oeis.FilterSequence;
import irvine.oeis.a376.A376298;

/**
 * A084733 Squares which are the sum of at least three successive terms of a geometric progression.
 * @author Sean A. Irvine
 */
public class A084733 extends FilterSequence {

  /** Construct the sequence. */
  public A084733() {
    super(1, new A376298(), SQUARE);
  }
}
