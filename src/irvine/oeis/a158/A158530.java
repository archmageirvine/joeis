package irvine.oeis.a158;
// manually holose at 2021-12-03
// egf: exp(14*x-x^2)

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A158530 a(n) = Hermite(n,7).
 * @author Georg Fischer
 */
public class A158530 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A158530() {
    super(0, "[[0],[2],[-14],[2, 1]]", "1", 2);
    setGfType(1);
  }
}
