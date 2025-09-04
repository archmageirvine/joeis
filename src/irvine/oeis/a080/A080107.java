package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005425;

/**
 * A080107 Number of fixed points of permutation of SetPartitions under {1,2,...,n}-&gt;{n,n-1,...,1}. Number of symmetric arrangements of non-attacking rooks on upper half of n X n chessboard.
 * @author Sean A. Irvine
 */
public class A080107 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Sequence seq = new A005425();
    if ((++mN & 1) == 0) {
      return Integers.SINGLETON.sum(0, mN / 2, k -> Functions.STIRLING2.z(mN / 2, k).multiply(seq.next()));
    } else {
      return Integers.SINGLETON.sum(1, (mN + 1) / 2, k -> Functions.STIRLING2.z((mN + 1) / 2, k).multiply(seq.next()));
    }
  }
}
