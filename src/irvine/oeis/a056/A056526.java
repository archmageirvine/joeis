package irvine.oeis.a056;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000960;

/**
 * A056526 First differences of Flavius Josephus's sieve.
 * @author Sean A. Irvine
 */
public class A056526 extends DifferenceSequence {

  /** Construct the sequence. */
  public A056526() {
    super(new A000960());
  }
}
