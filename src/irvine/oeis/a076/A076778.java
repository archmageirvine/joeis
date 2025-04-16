package irvine.oeis.a076;

import irvine.math.function.Functions;

/**
 * A076778 3-nadirs of Omega: numbers k such that Omega(k-3) &gt; Omega(k-2) &gt; Omega(k-1) &gt; Omega(k) &lt; Omega(k+1) &lt; Omega(k+2) &lt; Omega(k+3), where Omega(k) = number of prime factors of k, counting multiplicity.
 * @author Sean A. Irvine
 */
public class A076778 extends A076773 {

  /** Construct the sequence. */
  public A076778() {
    super(3, Functions.BIG_OMEGA);
  }
}
