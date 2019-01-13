package irvine.oeis.a000;

import java.util.Arrays;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A000368.
 * @author Sean A. Irvine
 */
public class A000368 extends A000081 {

  private Polynomial<Z> mR;

  /** Construct the sequence. */
  public A000368() {
    mR = RING.create(Arrays.asList(super.next(), super.next(), super.next(), super.next(), super.next()));
  }

  @Override
  public Z next() {
    final int n = size() - 1;
    mR = RING.add(mR, RING.monomial(super.next(), n + 1));
    return RING.pow(mR, 4, n).coeff(n)
      .add(RING.multiply(RING.pow(mR, 2, n), mR.substitutePower(2, n), n).coeff(n).multiply2())
      .add(RING.pow(mR.substitutePower(2, n), 2, n).coeff(n).multiply(3))
      .add(mR.substitutePower(4, n).coeff(n).multiply2())
      .divide(8);
  }
}

