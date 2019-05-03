package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256958 The integers (shown from <code>-50 on)</code>.
 * @author Sean A. Irvine
 */
public class A256958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256958() {
    super(new long[] {-1, 2}, new long[] {-50, -49});
  }
}
