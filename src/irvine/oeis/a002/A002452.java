package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002452 a(n) = (9^n - 1)/8.
 * @author Sean A. Irvine
 */
public class A002452 implements Sequence {

  private Z mNines = null;

  @Override
  public Z next() {
    mNines = mNines == null ? Z.ONE : mNines.multiply(9);
    return mNines.add(1).shiftRight(3);
  }
}
