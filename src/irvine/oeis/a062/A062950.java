package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a023.A023022;

/**
 * A062950 C(H(n)), where C(n) is Chowla's function (A048050) and H(n) is the half-totient function (A023022).
 * @author Sean A. Irvine
 */
public class A062950 extends AbstractSequence {

  private final A023022 mSeq1 = new A023022();

  /** Construct the sequence. */
  public A062950() {
    super(3);
  }

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    final Z n = mSeq1.next();
    return Functions.SIGMA.z(n).subtract(n).subtract(1);
  }
}

