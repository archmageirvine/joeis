package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056450 Number of palindromes of length n using a maximum of four different symbols.
 * @author Sean A. Irvine
 */
public class A056450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056450() {
    super(new long[] {4, 0}, new long[] {1, 4});
  }
}
