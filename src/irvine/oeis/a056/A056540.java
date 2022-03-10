package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056540 a(1) = 1; to form a(n+1), append a(n)-1, a(n)+1 at the beginning and the end of a(n), respectively. Ignore any leading 0's.
 * @author Georg Fischer
 */
public class A056540 implements Sequence {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A056540() {
    mN = 0;
    mA = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return mA;
    }
    final Z result = new Z(mA.subtract(1).toString() + mA + mA.add(1));
    mA = result;
    return result;
  }
}
