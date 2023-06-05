package irvine.oeis.a348;
// manually dirichcon/dirichcon2 at 2023-06-04 21:23

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a018.A018804;
import irvine.oeis.a347.A347130;

/**
 * A348495 a(n) = gcd(A018804(n), A347130(n)), where A347130 is the Dirichlet convolution of the identity function with the arithmetic derivative of n (A003415), and A018804 is Pillai&apos;s arithmetical function.
 * @author Georg Fischer
 */
public class A348495 extends Sequence1 {

  private final A018804 mSeq1 = new A018804();
  private final A347130 mSeq2 = new A347130();

  @Override
  public Z next() {
    return mSeq1.next().gcd(mSeq2.next());
  }
}
