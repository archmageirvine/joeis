package irvine.oeis.a005;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005127 Number of k for which n does not divide Stirling cycle numbers <code>[ {n</code> \atop k} ].
 * @author Sean A. Irvine
 */
public class A005127 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long c = 0;
    for (long k = 1; k <= mN; ++k) {
      if (Stirling.firstKind(mN, k).mod(mN) != 0) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

