package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158230 <code>256n^2+2n</code>.
 * @author Sean A. Irvine
 */
public class A158230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158230() {
    super(new long[] {1, -3, 3}, new long[] {258, 1028, 2310});
  }
}
