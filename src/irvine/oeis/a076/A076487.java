package irvine.oeis.a076;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a066.A066087;

/**
 * A076487 Solutions to gcd(sigma(x), phi(x)) = gcd(sigma(core(x)), phi(core(x))), i.e., when A009223(x) = A066086(x) or if A066087(x) = 0.
 * @author Sean A. Irvine
 */
public class A076487 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076487() {
    super(1, new A066087(), ZERO);
  }
}
