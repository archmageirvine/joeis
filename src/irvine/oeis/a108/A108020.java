package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108020 a(n) is the number whose binary representation is the concatenation of n strings of the four digits "1100".
 * @author Sean A. Irvine
 */
public class A108020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108020() {
    super(new long[] {-16, 17}, new long[] {0, 12});
  }
}
