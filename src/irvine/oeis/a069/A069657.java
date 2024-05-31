package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001006;

/**
 * A069657 Sum( S(n,k) * M(k-1), k=1..n), where S(n,k) = Stirling numbers of the second kind, M(n) = Motzkin numbers, A001006.
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
      sum = sum.add(Functions.STIRLING2.z(mN, k).multiply(motzkin.next()));
    }
    return sum;
  }
}

