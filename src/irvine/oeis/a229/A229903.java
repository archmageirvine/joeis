package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229903.
 * @author Sean A. Irvine
 */
public class A229903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229903() {
    super(new long[] {-1000000, 1000000, 1}, new long[] {190, 19190, 191919190});
  }
}
