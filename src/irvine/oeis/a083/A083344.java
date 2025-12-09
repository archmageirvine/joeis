package irvine.oeis.a083;

import irvine.oeis.Combiner;
import irvine.oeis.a066.A066715;
import irvine.oeis.a082.A082457;

/**
 * A083344 a(n) = A082457(n) - A066715(n) = gcd(2n+1, A057643(2n+1)) - gcd(2n+1, A000203(2n+1)).
 * @author Sean A. Irvine
 */
public class A083344 extends Combiner {

  /** Construct the sequence. */
  public A083344() {
    super(1, new A082457(), new A066715().skip(), SUBTRACT);
  }
}

