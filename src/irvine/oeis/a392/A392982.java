package irvine.oeis.a392;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a079.A079418;

/**
 * A392982 Run lengths of consecutive increases of prime(n)/n where prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A392982 extends DifferenceSequence {

  /** Construct the sequence. */
  public A392982() {
    super(1, new A079418().prepend(1));
  }
}
