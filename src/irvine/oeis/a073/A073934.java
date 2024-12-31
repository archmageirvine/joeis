package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060681;

/**
 * A073934 Sum of terms in n-th row of triangle in A073932.
 * @author Sean A. Irvine
 */
public class A073934 extends Sequence1 {

  private final DirectSequence mF = DirectSequence.create(new A060681());
  private int mN = 0;

  @Override
  public Z next() {
    int k = ++mN;
    Z sum = Z.valueOf(k);
    do {
      k = mF.a(k).intValueExact();
      sum = sum.add(k);
    } while (k > 1);
    return sum;
  }
}

