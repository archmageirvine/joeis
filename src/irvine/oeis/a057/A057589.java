package irvine.oeis.a057;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000959;

/**
 * A057589 Numbers n which are both lucky (A000959) and Fibonacci (A000045).
 * @author Sean A. Irvine
 */
public class A057589 extends IntersectionSequence {

  /** Construct the sequence. */
  public A057589() {
    super(new A000045(), new A000959());
  }
}
