package irvine.oeis.a075;

import irvine.oeis.PrependSequence;
import irvine.oeis.a054.A054750;

/**
 * A075360 Smallest prime (&gt; n-th prime) with sum of digits = the n-th prime, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A075360 extends PrependSequence {

  /** Construct the sequence. */
  public A075360() {
    super(1, new A054750().skip(4), 11, 0, 23, 43);
  }
}
