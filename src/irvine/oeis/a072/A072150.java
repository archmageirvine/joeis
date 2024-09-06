package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072150 Coordination sequence for AlPO_4-11 structure with respect to node (Y) where decagon, hexagon and square meet and is adjacent to node of type (X).
 * @author Sean A. Irvine
 */
public class A072150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072150() {
    super(0, new long[] {-1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0}, new long[] {3, 5, 8, 10, 13, 17, 18, 20, 25, 26, 28, 33}, 1);
  }
}
