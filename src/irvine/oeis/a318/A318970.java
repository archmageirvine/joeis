package irvine.oeis.a318;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A318970 a(1) = 3; for n &gt; 1, a(n) = 2^(a(n-1) - 1) + 5.
 * @author Georg Fischer
 */
public class A318970 implements Sequence {

  private int mN;
  private int mA;

  /** Construct the sequence. */
  public A318970() {
    mN = 0;
    mA = 3;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.THREE;
    }
    final Z result = Z.ONE.shiftLeft(mA - 1).add(5);
    mA = result.intValue();
    return result;
  }
}
