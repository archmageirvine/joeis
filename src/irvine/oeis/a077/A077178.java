package irvine.oeis.a077;

import irvine.oeis.a073.A073009;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A077178 Continued fraction expansion of Sum_{k &gt;= 1} 1/k^k.
 * @author Sean A. Irvine
 */
public class A077178 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A077178() {
    super(0, new A073009());
  }
}

