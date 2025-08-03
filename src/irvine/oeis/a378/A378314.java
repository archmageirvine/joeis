package irvine.oeis.a378;
// manually robots/partsun at 2025-08-02 15:05

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a190.A190940;

/**
 * A378314 a(n) = number of subsets of {1, 2, ..., n} that represent the first k divisors of m for some positive integers m and 1 &lt;= k &lt;= A000005(m).
 * @author Georg Fischer
 */
public class A378314 extends PrependSequence {

  /** Construct the sequence. */
  public A378314() {
    super(new PartialSumSequence(0, new A190940()), 0);
  }
}
