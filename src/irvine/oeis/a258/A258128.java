package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258128.
 * @author Sean A. Irvine
 */
public class A258128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258128() {
    super(new long[] {1, -1, -1331714, 1331714, 1}, new long[] {5461, 813281, 7272157205L, 1083057360705L, 9684433559760981L});
  }
}
