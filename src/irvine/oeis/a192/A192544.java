package irvine.oeis.a192;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A192544 Bases b such that all integers m having the commuting property r(m)^2 = r(m^2), where r is cyclic replacement of digits d-&gt;(d+1) mod b, are of the form m = (b/2 - 1)*(b^k - 1)/(b - 1) + 1 for k &gt;= 1.
 * @author Georg Fischer
 */
public class A192544 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A192544() {
    super(1, "[[0],[-1,-1],[0, 1]]", "8, 12", 0);
  }
}
