package irvine.oeis.a092;
// manually holom/holos at 2023-07-20 14:24

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A092471 a(n) = Sum_{i+j+k=n, 0&lt;=i&lt;=n, 0&lt;=j&lt;=n, 0&lt;=k&lt;=n} (n+i+j)!/((i+j)! * j! * k!).
 * @author Georg Fischer
 */
public class A092471 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A092471() {
    super(0, "[[0],[3,-7, 2],[-45, 118,-60, 8],[87,-274, 216,-48],[15,-26,-12, 8],[0, 5,-2]]", "[1, 5, 43, 495]", 0);
  }
}
