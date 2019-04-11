package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016904 <code>a(n) = (5*n + 4)^8</code>.
 * @author Sean A. Irvine
 */
public class A016904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016904() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {65536, 43046721, 1475789056, 16983563041L, 110075314176L, 500246412961L, 1785793904896L, 5352009260481L, 14048223625216L});
  }
}
