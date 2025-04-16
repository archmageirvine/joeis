package irvine.oeis.a076;

import irvine.math.function.Functions;

/**
 * A076761 3-apexes of omega: numbers k such that omega(k-3) &lt; omega(k-2) &lt; omega(k-1) &lt; omega(k) &gt; omega(k+1) &gt; omega(k+2) &gt; omega(k+3), where omega(m) = the number of distinct prime factors of m.
 * @author Sean A. Irvine
 */
public class A076761 extends A076759 {

  /** Construct the sequence. */
  public A076761() {
    super(3, Functions.OMEGA);
  }
}
