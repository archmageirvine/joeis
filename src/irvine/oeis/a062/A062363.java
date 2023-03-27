package irvine.oeis.a062;

import irvine.oeis.a000.A000142;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A062363 a(n) = Sum_{d|n} d!.
 * @author Sean A. Irvine
 */
public class A062363 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A062363() {
    super(new A000142(), 1);
  }
}
