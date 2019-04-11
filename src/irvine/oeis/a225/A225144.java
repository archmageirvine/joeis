package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225144 <code>a(n) =</code> Sum_{i=n..2*n} i^2*(-1)^i.
 * @author Sean A. Irvine
 */
public class A225144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225144() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 3, 11, 18, 42, 45});
  }
}
