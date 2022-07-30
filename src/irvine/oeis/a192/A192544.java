package irvine.oeis.a192;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A192544 Number bases n such that all integers m having the commuting property r(m)^2=r(m^2), where r is cyclic replacement of digits d-&gt;(d+1) mod n, are of the form m=A^k*B, where B=n/2, A=B-1, and 0&lt;=k&lt;=n-3.
 * @author Georg Fischer
 */
public class A192544 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A192544() {
    super(1, "[[0],[-1,-1],[0, 1]]", "8, 12", 0);
  }
}
