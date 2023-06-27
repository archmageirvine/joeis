package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027814 a(n) = 126*(n+1)*binomial(n+5,9)/5.
 * @author Sean A. Irvine
 */
public class A027814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027814() {
    super(4, new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {126, 1512, 9702, 44352, 162162, 504504, 1387386, 3459456, 7963956, 17153136, 34918884});
  }
}
