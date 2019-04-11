package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158739 <code>1296*n^2 + 36</code>.
 * @author Sean A. Irvine
 */
public class A158739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158739() {
    super(new long[] {1, -3, 3}, new long[] {36, 1332, 5220});
  }
}
