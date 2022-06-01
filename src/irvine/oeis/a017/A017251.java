package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017251 a(n) = (9*n+7)^7.
 * @author Sean A. Irvine
 */
public class A017251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017251() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {823543, 268435456, 6103515625L, 52523350144L, 271818611107L, 1028071702528L, 3142742836021L, 8235430000000L});
  }
}
