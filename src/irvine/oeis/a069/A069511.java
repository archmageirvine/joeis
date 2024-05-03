package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A069511 Numbers in which starting from most significant digit the n-th digit is obtained by adding n to the (n-1)-st digit (the digit to the left of it) and then ignoring the carry. Alternately the n-th digit starting from the most significant digit is the n-th triangular number mod 10.
 * @author Sean A. Irvine
 */
public class A069511 extends Sequence1 {

  private Z mA = Z.ZERO;
  private final Sequence mT = new A000217().skip(1);

  @Override
  public Z next() {
    mA = mA.multiply(10).add(mT.next().mod(10));
    return mA;
  }
}

