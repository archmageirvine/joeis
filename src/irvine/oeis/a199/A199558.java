package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199558 <code>11*8^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199558() {
    super(new long[] {-8, 9}, new long[] {12, 89});
  }
}
