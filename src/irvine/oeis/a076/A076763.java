package irvine.oeis.a076;

import irvine.math.function.Functions;

/**
 * A076763 1-apexes of omega: numbers n such that omega(n-1) &lt; omega(n) &gt; omega(n+1), where omega(m) = the number of distinct prime factors of m.
 * @author Sean A. Irvine
 */
public class A076763 extends A076759 {

  /** Construct the sequence. */
  public A076763() {
    super(1, Functions.OMEGA);
  }
}
