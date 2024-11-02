package irvine.oeis.a072;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000213;

/**
 * A072874 Numbers k such that A000213(k) == 1 (mod k).
 * @author Sean A. Irvine
 */
public class A072874 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072874() {
    super(1, 1, new A000213().skip(), (n, k) -> n == 1 || k.mod(n) == 1);
  }
}

