package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016855 a(n) = (5*n)^7.
 * @author Sean A. Irvine
 */
public class A016855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016855() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 78125, 10000000, 170859375, 1280000000, 6103515625L, 21870000000L, 64339296875L});
  }
}
