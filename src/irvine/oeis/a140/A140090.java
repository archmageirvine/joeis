package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140090.
 * @author Sean A. Irvine
 */
public class A140090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140090() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 13});
  }
}
