package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017002 a(n) = (7*n + 1)^10.
 * @author Sean A. Irvine
 */
public class A017002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017002() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 1073741824, 576650390625L, 26559922791424L, 420707233300201L, 3656158440062976L, 21611482313284249L, 97656250000000000L, 362033331456891249L, 1152921504606846976L, 3255243551009881201L});
  }
}
