package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016772 <code>a(n) = (3*n)^8</code>.
 * @author Sean A. Irvine
 */
public class A016772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016772() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 6561, 1679616, 43046721, 429981696, 2562890625L, 11019960576L, 37822859361L, 110075314176L});
  }
}
