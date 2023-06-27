package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056488 Number of periodic palindromes using a maximum of six different symbols.
 * @author Sean A. Irvine
 */
public class A056488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056488() {
    super(1, new long[] {6, 0}, new long[] {6, 21});
  }
}
