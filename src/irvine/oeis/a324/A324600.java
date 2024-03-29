package irvine.oeis.a324;
// Generated by gen_seq4.pl dirtraf at 2024-02-05 19:10

import irvine.oeis.a000.A000217;
import irvine.oeis.a018.A018252;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A324600 a(n) = (k(n)*(k(n) + 1))/2 with k = A018252 (nonprime numbers), for n &gt;= 1.
 * @author Georg Fischer
 */
public class A324600 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A324600() {
    super(1, new A000217(), new A018252());
  }
}
