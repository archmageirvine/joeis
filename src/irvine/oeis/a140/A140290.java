package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140290.
 * @author Sean A. Irvine
 */
public class A140290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140290() {
    super(new long[] {-15, -17, -7}, new long[] {-1, 2, -4});
  }
}
