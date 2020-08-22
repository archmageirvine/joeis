package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017444 a(n) = (11*n + 4)^8.
 * @author Sean A. Irvine
 */
public class A017444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017444() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {65536, 2562890625L, 208827064576L, 3512479453921L, 28179280429056L, 146830437604321L, 576480100000000L, 1853020188851841L, 5132188731375616L});
  }
}
