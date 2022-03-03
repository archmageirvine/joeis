package irvine.oeis.a054;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000384;
import irvine.oeis.a002.A002113;

/**
 * A054969 Palindromic hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A054969 extends IntersectionSequence {

  /** Construct the sequence. */
  public A054969() {
    super(new A000384(), new A002113());
  }
}
