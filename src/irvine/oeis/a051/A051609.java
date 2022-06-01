package irvine.oeis.a051;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051609 a(n) = (3*n+9)!!!/9!!!, related to A032031 ((3*n)!!! triple factorials).
 * @author Georg Fischer
 */
public class A051609 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051609() {
    super(0, "[[0],[-9,-3],[1]]", "[1]", 0);
  }
}
