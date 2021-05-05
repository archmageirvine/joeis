package irvine.oeis.a051;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A051607 a(n) = (3*n+7)!!!/7!!!, related to A007559(n+1) ((3*n+1)!!! triple factorials).
 * @author Georg Fischer
 */
public class A051607 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051607() {
    super(0, "[[0],[-7,-3],[1]]", "[1]", 0);
  }
}
