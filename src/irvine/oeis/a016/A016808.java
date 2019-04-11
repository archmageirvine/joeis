package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016808 <code>a(n) = (4n)^8</code>.
 * @author Sean A. Irvine
 */
public class A016808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016808() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 65536, 16777216, 429981696, 4294967296L, 25600000000L, 110075314176L, 377801998336L, 1099511627776L});
  }
}
