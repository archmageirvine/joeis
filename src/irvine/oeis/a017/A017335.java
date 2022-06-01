package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017335 a(n) = (10*n + 5)^7.
 * @author Sean A. Irvine
 */
public class A017335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017335() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {78125, 170859375, 6103515625L, 64339296875L, 373669453125L, 1522435234375L, 4902227890625L, 13348388671875L});
  }
}
