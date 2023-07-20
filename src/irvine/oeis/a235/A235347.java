package irvine.oeis.a235;
// manually holom/holos at 2023-07-20 14:24

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A235347 Series reversion of x*(1-3*x^2)/(1-x^2) in odd-order powers.
 * @author Georg Fischer
 */
public class A235347 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A235347() {
    super(0, "[[0],[-15, 11,-2],[375,-396, 102],[-90, 391,-382],[0, 12, 24]]", "[1, 2, 14]", 0);
  }
}
