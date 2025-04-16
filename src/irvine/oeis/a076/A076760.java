package irvine.oeis.a076;

import irvine.math.function.Functions;

/**
 * A076760 3-apexes of Omega: numbers k such that Omega(k-3) &lt; Omega(k-2)&lt; Omega(k-1) &lt; Omega(k) &gt; Omega(k+1) &gt; Omega(k+2) &gt; Omega(k+3), where Omega(m) = the number of prime factors of m, counting multiplicity.
 * @author Sean A. Irvine
 */
public class A076760 extends A076759 {

  /** Construct the sequence. */
  public A076760() {
    super(3, Functions.BIG_OMEGA);
  }
}
