package irvine.oeis.a072;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a056.A056964;

/**
 * A072366 Numbers x such that x + reverse of x is a prime.
 * @author Sean A. Irvine
 */
public class A072366 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072366() {
    super(1, new A056964().skip(), PRIME);
  }
}
