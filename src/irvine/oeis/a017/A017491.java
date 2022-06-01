package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017491 a(n) = (11*n + 8)^7.
 * @author Sean A. Irvine
 */
public class A017491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017491() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {2097152, 893871739, 21870000000L, 194754273881L, 1028071702528L, 3938980639167L, 12151280273024L, 32057708828125L});
  }
}
