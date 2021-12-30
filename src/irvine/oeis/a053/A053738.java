package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053738 If k is in sequence then 2*k and 2*k+1 are not (and 1 is in the sequence); numbers with an odd number of digits in binary.
 * @author Georg Fischer
 */
public class A053738 implements Sequence {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if ((mN.bitLength() & 1) == 1) {
        return mN;
      }
    }
  }
}
