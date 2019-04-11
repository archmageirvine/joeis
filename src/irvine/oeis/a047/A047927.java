package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047927 <code>n*(n-1)*(n-2)^2</code>.
 * @author Sean A. Irvine
 */
public class A047927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047927() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 6, 48, 180, 480});
  }
}
