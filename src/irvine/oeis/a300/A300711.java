package irvine.oeis.a300;
// manually quots/quot at 2021-11-26 22:57

import irvine.oeis.QuotientSequence;
import irvine.oeis.a000.A000367;
import irvine.oeis.a001.A001067;

/**
 * A300711 a(n) = A000367(n)/A001067(n).
 * @author Georg Fischer
 */
public class A300711 extends QuotientSequence {

  /** Construct the sequence. */
  public A300711() {
    super(new A000367(), new A001067(), 1, 0);
  }
}
