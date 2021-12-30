package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053754 If k is in the sequence then 2*k and 2*k+1 are not (and 0 is in the sequence); when written in binary k has an even number of bits (0 has 0 digits).
 * @author Georg Fischer
 */
public class A053754 implements Sequence {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    if (mN.isZero()) {
      mN = Z.ONE;
      return Z.ZERO;
    }
    while (true) {
      mN = mN.add(1);
      if ((mN.bitLength() & 1) == 0) {
        return mN;
      }
    }
  }
}
