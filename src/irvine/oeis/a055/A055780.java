package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055780 Number of symmetric types of <code>(3</code>,2n)-hypergraphs under action of complementing group <code>C(3,2)</code>.
 * @author Sean A. Irvine
 */
public class A055780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055780() {
    super(new long[] {-1, 2, 0, -2, 2, -2, 0, 2}, new long[] {1, 7, 14, 35, 57, 98, 140, 210});
  }
}
