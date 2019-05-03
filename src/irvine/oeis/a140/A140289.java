package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140289 First quadrisection of <code>A140287</code>.
 * @author Sean A. Irvine
 */
public class A140289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140289() {
    super(new long[] {-15, -17, -7}, new long[] {0, 0, 1});
  }
}
