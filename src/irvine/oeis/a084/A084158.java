package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084158 <code>a(n) = A000129(n)*A000129(n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A084158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084158() {
    super(new long[] {-1, 5, 5}, new long[] {0, 1, 5});
  }
}
