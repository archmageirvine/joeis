package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164444.
 * @author Sean A. Irvine
 */
public class A164444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164444() {
    super(new long[] {1, -1, 1, 1}, new long[] {13, 21, 32, 48});
  }
}
