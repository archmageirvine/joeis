package irvine.oeis.a051;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A051606 a(n) = (3*n+6)!!!/6!!!, related to A032031 ((3*n)!!! triple factorials).
 * @author Georg Fischer
 */
public class A051606 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051606() {
    super(0, "[[0],[-6,-3],[1]]", "[1]", 0);
  }
}
