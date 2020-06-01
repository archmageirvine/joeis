package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122652 <code>a(0) = 0, a(1) = 4;</code> for <code>n &gt; 1, a(n) = 10*a(n-1) - a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A122652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122652() {
    super(new long[] {-1, 10}, new long[] {0, 4});
  }
}
