package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078876 <code>a(n) = n^4*(n^4-1)/240</code>.
 * @author Sean A. Irvine
 */
public class A078876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078876() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 27, 272, 1625, 6993, 24010, 69888, 179334});
  }
}
