package irvine.oeis.a176;
// manually 2021-09-23

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A176892 Decimal representation of the reverted binary representation of n followed by digits substitution 0-&gt;2, 1-&gt;3. 
 * @author Georg Fischer
 */
public class A176892 extends Sequence0 {

  protected Z mN;

  /** Construct the sequence. */
  public A176892() {
    mN = Z.NEG_ONE;
  }

  @Override
  public Z next() {
    mN = mN.add(Z.ONE);
    final StringBuilder binStr = new StringBuilder(mN.toString(2)).reverse();
    for (int i = binStr.length() - 1; i >= 0; --i) {
      binStr.setCharAt(i, (char) (binStr.charAt(i) + 2));
    }
    return new Z(binStr);
  }
}
