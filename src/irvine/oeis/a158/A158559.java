package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158559 <code>a(n) = 225*n^2 - 15</code>.
 * @author Sean A. Irvine
 */
public class A158559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158559() {
    super(new long[] {1, -3, 3}, new long[] {210, 885, 2010});
  }
}
