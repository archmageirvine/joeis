package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199110 <code>7*3^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199110() {
    super(new long[] {-3, 4}, new long[] {8, 22});
  }
}
