package irvine.oeis.a249;
// manually 2021-05-29 (offset=0)

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A249922 E.g.f. satisfies: A(x) = x + 4*A(x)^5/5.
 * @author Georg Fischer
 */
public class A249922 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A249922() {
    super(0, "[[0],[-96, 1000,-3500, 5000,-2500],[1]]", "1", 0);
  }
}
