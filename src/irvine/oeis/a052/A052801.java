package irvine.oeis.a052;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052801 A simple grammar: labeled pairs of sequences of cycles.
 * @author Sean A. Irvine
 */
public class A052801 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k <= mN; f = f.multiply(++k + 1)) {
      sum = sum.add(f.multiply(Stirling.firstKind(mN, k).abs()));
    }
    return sum;
  }
}
