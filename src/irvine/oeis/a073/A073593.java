package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073593 Number of cards needed to be drawn (with replacement) from a deck of n cards to have a 50% or greater chance of seeing each card at least once.
 * @author Sean A. Irvine
 */
public class A073593 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z fn = Functions.FACTORIAL.z(++mN).multiply2();
    long k = 0;
    Z nk = Z.ONE;
    while (true) {
      nk = nk.multiply(mN);
      if (Functions.STIRLING2.z(++k, mN).multiply(fn).compareTo(nk) >= 0) {
        return Z.valueOf(k);
      }
    }
  }
}

