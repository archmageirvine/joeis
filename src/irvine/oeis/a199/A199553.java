package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199553 <code>5*8^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199553() {
    super(new long[] {-8, 9}, new long[] {6, 41});
  }
}
