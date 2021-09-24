package irvine.oeis.a186;
// manually ajrank at 2021-09-24 21:19

import irvine.oeis.LinearRecurrence;
import irvine.oeis.RankSequence;
import irvine.oeis.a000.A000290;

/**
 * A186513 Adjusted joint rank sequence of (f(i)) and (g(j)) with f(i) before g(j) when f(i)=g(j), where f(i)=i^2 and g(j)=4+5j^2.  Complement of A186514.
 * @author Georg Fischer
 */
public class A186513 extends RankSequence {

  /** Construct the sequence. */
  public A186513() {
    this(0, 1);
  }

  /** 
   * Generic constructor with parameters
   * @param order 0 or 1
   * @param flag 1 or 2
   */
  public A186513(final int order, final int flag) {
    super(new A000290(), new LinearRecurrence(new long[] {1, -3, 3}, new long[] {9, 24, 49}), order, flag);
  }

}
