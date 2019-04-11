package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199554 <code>6*8^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199554() {
    super(new long[] {-8, 9}, new long[] {7, 49});
  }
}
