package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199406 The number of inequivalent ways to color the edges of a cube using at most n colors.
 * @author Sean A. Irvine
 */
public class A199406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199406() {
    super(1, new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 144, 12111, 358120, 5131650, 45528756, 288936634, 1433251296, 5887880415L, 20842168600L, 65402344161L, 185788177224L, 485443851256L});
  }
}
