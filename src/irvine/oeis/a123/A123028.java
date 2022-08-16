package irvine.oeis.a123;
// manually at 2022-08-15


import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A123028 a(n) = (3*n^2 + 3*n + 1)*a(n-2), for n&gt;2, with a(0) = a(1) = 1.
 * @author Georg Fischer
 */
public class A123028 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123028() {
    super(0, "[[0],[-1, 3,-3],[0],[1]]", "1, 1", -1);
  }
}
