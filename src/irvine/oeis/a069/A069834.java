package irvine.oeis.a069;
// manually anopsn 1, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000265;

/**
 * A069834 a(n) = n-th reduced triangular number: n*(n+1)/{2^k} where 2^k is the largest power of 2 that divides product n*(n+1).
 * @author Georg Fischer
 */
public class A069834 extends AbstractSequence {

  private A000265 mSeq1 = new A000265();
  private Z mA;

  /** Construct the sequence. */
  public A069834() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.multiply(mA);
    mA = b;
    return result;
  }
}
