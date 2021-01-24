package irvine.oeis.a278;
// manually 2021-01-21

import irvine.oeis.HolonomicRecurrence;

/**
 * A278069 a(n) = hypergeometric([n, -n], [], 1).
 * (2*n-1)*a(n-2)-8*(1+n*(n-2))*a(n-1)-(2*n-3)*a(n)=0.
 *
 * @author Georg Fischer
 */
public class A278069 extends HolonomicRecurrence {

  /**
   * Construct the sequence.
   */
  public A278069() {
    super(0, "[[0],[-1, 2],[-8, 16,-8],[3,-2]]", "1", 0);
  }
}
