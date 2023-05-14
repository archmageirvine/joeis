package irvine.oeis.a063;

import irvine.oeis.FilterSequence;
import irvine.oeis.a064.A064052;

/**
 * A063763 Composite integers k such that largest prime factor of k &gt; sqrt(k).
 * @author Sean A. Irvine
 */
public class A063763 extends FilterSequence {

  /** Construct the sequence. */
  public A063763() {
    super(new A064052(), k -> !k.isProbablePrime());
  }
}
