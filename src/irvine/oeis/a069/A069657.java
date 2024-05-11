package irvine.oeis.a069;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001006;

/**
 * A069055.
 * @author Sean A. Irvine
 */
public class A069657 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final Sequence motzkin = new A001006();
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN, k).multiply(motzkin.next()));
    }
    return sum;
  }
}

