package irvine.oeis.a062;

import irvine.oeis.PrependSequence;
import irvine.oeis.a038.A038623;

/**
 * A062743 Smallest prime prime(m) such that floor(prime(m)/m) = n.
 * @author Sean A. Irvine
 */
public class A062743 extends PrependSequence {

  /** Construct the sequence. */
  public A062743() {
    super(1, new A038623().skip(2), 3, 2);
  }
}

