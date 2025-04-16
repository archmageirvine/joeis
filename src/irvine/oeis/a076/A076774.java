package irvine.oeis.a076;

import irvine.math.function.Functions;

/**
 * A076774 2-nadirs of sigma: numbers k such that sigma(k-2) &gt; sigma(k-1) &gt; sigma(k) &lt; sigma(k+1) &lt; sigma(k+2).
 * @author Sean A. Irvine
 */
public class A076774 extends A076773 {

  /** Construct the sequence. */
  public A076774() {
    super(2, Functions.SIGMA1);
  }
}
