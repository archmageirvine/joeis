package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016819 <code>a(n) = (4n+1)^7</code>.
 * @author Sean A. Irvine
 */
public class A016819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016819() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 78125, 4782969, 62748517, 410338673, 1801088541, 6103515625L, 17249876309L});
  }
}
