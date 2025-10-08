package irvine.oeis.a081;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a080.A080998;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A081000 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081000() {
    super(1, 1, new A080998(), (n, k) -> k.compareTo(n) <= 0);
  }
}

