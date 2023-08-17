package irvine.oeis.a088;
// manually robots/union2 at 2023-08-15 15:43

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a005.A005408;

/**
 * A088948 Numbers k such that (A006530(k) + A020639(k))/2 is an integer; that is, arithmetic mean of least and largest prime factor is an integer.
 * @author Georg Fischer
 */
public class A088948 extends UnionSequence {

  /** Construct the sequence. */
  public A088948() {
    super(1, new A005408().skip(1), new A000079().skip(1));
  }
}
