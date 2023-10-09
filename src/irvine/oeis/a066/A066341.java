package irvine.oeis.a066;

import java.util.HashSet;

import irvine.math.z.Z;

/**
 * A066341 Sum of distinct terms in n-th row of Fermat's triangle.
 * @author Sean A. Irvine
 */
public class A066341 extends A066340 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Z> seen = new HashSet<>();
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      final Z t = super.next();
      if (seen.add(t)) {
        sum = sum.add(t);
      }
    }
    return sum;
  }
}
