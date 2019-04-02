package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091761 a(n) = Pell(4n) / Pell(4).
 * @author Sean A. Irvine
 */
public class A091761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091761() {
    super(new long[] {-1, 34}, new long[] {0, 1});
  }
}
