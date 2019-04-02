package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059841 Period 2: Repeat [1,0]. a(n) = 1 - (n mod 2).
 * @author Sean A. Irvine
 */
public class A059841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059841() {
    super(new long[] {1, 0}, new long[] {1, 0});
  }
}
