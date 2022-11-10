package irvine.oeis.a060;

import irvine.oeis.Combiner;
import irvine.oeis.a054.A054265;
import irvine.oeis.a065.A065091;

/**
 * A060325 a(n) = n-th prime prime(n) subtracted from sum of all composites between prime(n) and prime(n-1).
 * @author Sean A. Irvine
 */
public class A060325 extends Combiner {

  /** Construct the sequence. */
  public A060325() {
    super(2, new A054265(), new A065091(), SUBTRACT);
  }
}
