package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256859.
 * @author Sean A. Irvine
 */
public class A256859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256859() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 6, 25, 80, 210, 476});
  }
}
