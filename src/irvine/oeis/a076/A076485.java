package irvine.oeis.a076;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a066.A066087;

/**
 * A076485 Solutions to gcd(sigma(x), phi(x)) &gt; gcd(sigma(core(x)), phi(core(x))), i.e., when A009223(x) &gt; A066086(x) or if A066087(x) &gt; 0.
 * @author Sean A. Irvine
 */
public class A076485 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076485() {
    super(1, new A066087(), k -> k.signum() > 0);
  }
}
