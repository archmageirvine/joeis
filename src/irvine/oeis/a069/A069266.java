package irvine.oeis.a069;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a068.A068976;

/**
 * A266780.
 * @author Sean A. Irvine
 */
public class A069266 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069266() {
    super(1, 1, new A068976(), (k, v) -> v.compareTo(2 * k) > 0);
  }
}
