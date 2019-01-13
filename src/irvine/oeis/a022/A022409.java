package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022409.
 * @author Sean A. Irvine
 */
public class A022409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022409() {
    super(new long[] {-1, 0, 2}, new long[] {3, 10, 14});
  }
}
