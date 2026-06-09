package irvine.oeis.a085;

import irvine.oeis.DifferenceSequence;

/**
 * A085243 a(n) = A085238(n+1) - A085238(n).
 * @author Sean A. Irvine
 */
public class A085243 extends DifferenceSequence {

  /** Construct the sequence. */
  public A085243() {
    super(1, new A085238().skip(), false);
  }
}
