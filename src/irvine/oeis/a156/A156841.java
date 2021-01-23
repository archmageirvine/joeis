package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156841 529n^2 - 312n + 46.
 * @author Sean A. Irvine
 */
public class A156841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156841() {
    super(new long[] {1, -3, 3}, new long[] {46, 263, 1538});
  }
}
