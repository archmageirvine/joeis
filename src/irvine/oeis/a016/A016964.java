package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016964 a(n) = (6*n + 4)^8.
 * @author Sean A. Irvine
 */
public class A016964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016964() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {65536, 100000000, 4294967296L, 54875873536L, 377801998336L, 1785793904896L, 6553600000000L, 20047612231936L, 53459728531456L});
  }
}
