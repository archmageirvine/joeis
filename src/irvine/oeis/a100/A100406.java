package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100406 a(n) = repeating period of the digital roots of the sequence {m^n, m=1,2,3...}.
 * @author Sean A. Irvine
 */
public class A100406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100406() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 124875, 9, 147, 157842, 9, 174, 18, 9});
  }
}
