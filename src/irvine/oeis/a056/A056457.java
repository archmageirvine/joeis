package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056457 Palindromes using exactly six different symbols.
 * @author Sean A. Irvine
 */
public class A056457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056457() {
    super(new long[] {-720, 720, 1044, -1044, -580, 580, 155, -155, -20, 20, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 720});
  }
}
