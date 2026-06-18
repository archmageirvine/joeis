package irvine.oeis.a085;

import irvine.oeis.DifferenceSequence;

/**
 * A085402 a(n) = abs(A085401(n-1) - A085401(n)).
 * @author Sean A. Irvine
 */
public class A085402 extends DifferenceSequence {

  /** Construct the sequence. */
  public A085402() {
    super(1, new A085401(), true);
  }
}
