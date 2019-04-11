package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026150 <code>a(0) = a(1) = 1</code>; <code>a(n+2) = 2*a(n+1) + 2*a(n)</code>.
 * @author Sean A. Irvine
 */
public class A026150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026150() {
    super(new long[] {2, 2}, new long[] {1, 1});
  }
}
