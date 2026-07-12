package irvine.oeis.a085;

import irvine.oeis.a000.A000007;
import irvine.oeis.a000.A000108;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A085792 Triangle T(n, k) read by rows; given by [1, 0, 0, 0, 0, ...] DELTA [1, 1, 2, 5, 14, 42, 132, 429, 1430, ...] (A000108) where DELTA is Del\u00e9ham's operator defined in A084938.
 * @author Sean A. Irvine
 */
public class A085792 extends DelehamDeltaSequence {

  /** Construct the sequence. */
  public A085792() {
    super(new A000007(), new A000108());
  }
}
