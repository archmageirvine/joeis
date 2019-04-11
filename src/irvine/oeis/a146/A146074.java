package irvine.oeis.a146;

import irvine.oeis.FiniteSequence;

/**
 * A146074 <code>a(n) =</code> number of elements of order n in Mathieu simple group M_24 of order 244823040.
 * @author Sean A. Irvine
 */
public class A146074 extends FiniteSequence {

  // Could be done via OrdersFiniteGroupSequence, but too slow for M24

  /** Construct the sequence. */
  public A146074() {
    super(1, 43263, 712448, 5100480, 4080384, 20401920, 11658240, 15301440, 0, 12241152, 22256640, 40803840, 0, 34974720, 32643072, 0, 0, 0, 0, 0, 23316480, 0, 21288960);
  }
}

