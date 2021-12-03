package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a046.A046976;

/**
 * A053005 Denominator of beta(2n+1)/Pi^(2n+1), where beta(m) = Sum_{k=0..inf} (-1)^k/(2k+1)^m.
 * @author Sean A. Irvine
 */
public class A053005 extends A046976 {

  @Override
  protected Z select(final Q n) {
    return n.den().shiftLeft(mN + 2);
  }
}
