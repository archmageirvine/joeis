package irvine.oeis.a333;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A333447 a(n) is the integer corresponding to a bit-string representation of the von Neumann ordinal representation of n, with largest sets listed first, and with &apos;{&apos; represented by the bit 1, &apos;}&apos; represented by the bit zero, and ignoring commas.
 * a(0) = 2, a(n) = 2^(2^(n+1)-1) - 2^(2^(n)-1) + a(n-1)*(2^(2^(n)-1) + 1).
 * @author Georg Fischer
 */
public class A333447 implements Sequence {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A333447() {
    mN = -1;
    mA = Z.TWO;
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      final int n21 = (1 << mN) - 1;
      mA = Z.ONE.shiftLeft(2 * n21 + 1).subtract(Z.ONE.shiftLeft(n21)).add(mA.multiply(Z.ONE.shiftLeft(n21).add(1)));
    }
    return mA;
  }
}
