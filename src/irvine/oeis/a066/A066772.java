package irvine.oeis.a066;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A066772 Continued fraction expansion for Sum_{k&gt;=1} d(k)/2^k where d(k) are divisors of k, 1 &lt;= d &lt;= k.
 * @author Sean A. Irvine
 */
public class A066772 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A066772() {
    super(new A066766());
  }
}

