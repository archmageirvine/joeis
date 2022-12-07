package irvine.oeis.a249;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a143.A143157;

/**
 * A249153 Exponent of 2 in the hyperfactorial of 2n: a(n) = A007814(A002109(2n)).
 * @author Georg Fischer
 */
public class A249153 extends Sequence0 {

  private int mN = -1;
  private final Sequence mSeq = new A143157();

  @Override
  public Z next() {
    // a(n) = 2*A143157(n).
    return mSeq.next().multiply(Z.TWO);
  }
}
