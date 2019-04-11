package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199115 <code>5*4^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199115() {
    super(new long[] {-4, 5}, new long[] {6, 21});
  }
}
