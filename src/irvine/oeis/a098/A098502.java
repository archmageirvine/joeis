package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098502 <code>16*n - 4</code>.
 * @author Sean A. Irvine
 */
public class A098502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098502() {
    super(new long[] {-1, 2}, new long[] {12, 28});
  }
}
