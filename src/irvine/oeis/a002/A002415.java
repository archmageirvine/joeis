package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002415 4-dimensional pyramidal numbers: a(n) = n^2*(n^2-1)/12.
 * @author Sean A. Irvine
 */
public class A002415 extends AbstractSequence {

  /* Construct the sequence. */
  public A002415() {
    super(0);
  }

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n2 = mN.square();
    return n2.multiply(n2.subtract(1)).divide(12);
  }
}
