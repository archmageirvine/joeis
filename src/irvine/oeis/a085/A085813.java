package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085813 Number of cards that need to be drawn (with replacement) from a deck of n cards to have a 95% or greater chance of seeing each card at least once.
 * @author Sean A. Irvine
 */
public class A085813 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (Functions.STIRLING2.z(mM, mN).multiply(Functions.FACTORIAL.z(mN)).multiply(20).compareTo(Z.valueOf(mN).pow(mM).multiply(19)) < 0) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
