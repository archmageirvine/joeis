package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240933 n^10 - n^9.
 * @author Sean A. Irvine
 */
public class A240933 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240933() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 0, 512, 39366, 786432, 7812500, 50388480, 242121642, 939524096, 3099363912L, 9000000000L});
  }
}
