package irvine.oeis.a078;

import irvine.oeis.a065.A065476;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A078090 Continued fraction expansion of Product_{p prime &gt;= 3} (1 - (p+2)/p^3).
 * @author Sean A. Irvine
 */
public class A078090 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A078090() {
    super(0, new A065476());
  }
}

