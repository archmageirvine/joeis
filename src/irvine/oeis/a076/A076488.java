package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a066.A066087;

/**
 * A076488 Nonsquarefree solutions to gcd(sigma(x), phi(x)) = gcd(sigma(core(x)), Phi(core(x))), i.e., when A009223(x) = A066086(x) or if A066087(x)=0 and mu(x)=0.
 * @author Sean A. Irvine
 */
public class A076488 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076488() {
    super(1, 1, new A066087(), (n, k) -> k.isZero() && Functions.MOBIUS.i(n) == 0);
  }
}
