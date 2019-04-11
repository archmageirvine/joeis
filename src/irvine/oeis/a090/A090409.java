package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090409 <code>7*8^n/9+2(-1)^n/9</code>.
 * @author Sean A. Irvine
 */
public class A090409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090409() {
    super(new long[] {8, 7}, new long[] {1, 6});
  }
}
