package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A057966 Triangle T(n,k) of number of minimal 5-covers of a labeled n-set that cover k points of that set uniquely (k=5,..,n).
 * @author Sean A. Irvine
 */
public class A057966 extends AbstractSequence {

  /** Construct the sequence. */
  public A057966() {
    super(5);
  }

  private static final Z Z26 = Z.valueOf(26);
  private int mN = 4;
  private int mM = 4;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 5;
    }
    return Binomial.binomial(mN, mM).multiply(Functions.STIRLING2.z(mM, 5)).multiply(Z26.pow(mN - mM));
  }
}
