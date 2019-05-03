package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075269 Product of Lucas numbers and inverted Lucas numbers: <code>a(n)=A000032(n)*A075193(n)</code>.
 * @author Sean A. Irvine
 */
public class A075269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075269() {
    super(new long[] {1, 2, -2}, new long[] {2, -3, 12});
  }
}
