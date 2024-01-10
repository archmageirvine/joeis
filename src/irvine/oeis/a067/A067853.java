package irvine.oeis.a067;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a011.A011757;

/**
 * A067853 Numbers k such that k divides prime(k^2)+1.
 * @author Sean A. Irvine
 */
public class A067853 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A067853() {
    super(1, 1, new A011757(), (n, k) -> k.add(1).mod(n) == 0);
  }
}
