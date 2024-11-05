package irvine.oeis.a072;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a037.A037449;

/**
 * A072903 Numbers m such that the discriminant of the quadratic field Q(sqrt(m)) &lt; m.
 * @author Sean A. Irvine
 */
public class A072903 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072903() {
    super(1, 1, new A037449(), (n, k) -> k.compareTo(n) < 0);
  }
}

