package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086950 Binomial transform of decagonal numbers A001107.
 * @author Sean A. Irvine
 */
public class A086950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086950() {
    super(new long[] {8, -12, 6}, new long[] {0, 1, 12});
  }
}
