package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059860 <code>a(n) =</code> binomial(n+1, <code>2)^5</code>.
 * @author Sean A. Irvine
 */
public class A059860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059860() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 243, 7776, 100000, 759375, 4084101, 17210368, 60466176, 184528125, 503284375, 1252332576});
  }
}
