package irvine.oeis.a088;

import irvine.oeis.DifferenceSequence;

/**
 * A088197 First differences of A088196.
 * @author Sean A. Irvine
 */
public class A088197 extends DifferenceSequence {

  /** Construct the sequence. */
  public A088197() {
    super(1, new A088196());
  }
}

