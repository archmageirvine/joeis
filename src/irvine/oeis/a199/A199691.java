package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199691 <code>11*10^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199691() {
    super(new long[] {-10, 11}, new long[] {12, 111});
  }
}
