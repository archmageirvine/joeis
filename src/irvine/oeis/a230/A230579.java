package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230579 a(n) = 2^n mod 341.
 * @author Sean A. Irvine
 */
public class A230579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230579() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {1, 2, 4, 8, 16, 32, 64, 128, 256});
  }
}
