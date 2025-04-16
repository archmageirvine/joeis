package irvine.oeis.a076;

import irvine.math.function.Functions;

/**
 * A076762 2-apexes of omega: numbers k such that omega(k-2) &lt; omega(k-1) &lt; omega(k) &gt; omega(k+1) &gt; omega(k+2), where omega(m) = the number of distinct prime factors of m.
 * @author Sean A. Irvine
 */
public class A076762 extends A076759 {

  /** Construct the sequence. */
  public A076762() {
    super(2, Functions.OMEGA);
  }
}
