package irvine.oeis.a108;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A108209 a(n) = 5*(n-1)*a(n-1) -2*(n-1)*a(n-2) with a(0)=0, a(1)=2.
 * @author Georg Fischer
 */
public class A108209 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A108209() {
    super(0, "[[0],[2,-2],[-5, 5],[-1]]", "[0, 2]", 0);
  }
}
