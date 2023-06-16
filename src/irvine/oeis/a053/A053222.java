package irvine.oeis.a053;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000203;

/**
 * A053222 First differences of sigma(n).
 * @author Sean A. Irvine
 */
public class A053222 extends DifferenceSequence {

  /** Construct the sequence. */
  public A053222() {
    super(1, new A000203());
  }
}
