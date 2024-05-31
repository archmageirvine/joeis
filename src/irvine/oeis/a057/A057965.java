package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A057965 Triangle T(n,k) of number of minimal 4-covers of a labeled n-set that cover k points of that set uniquely (k=4,..,n).
 * @author Sean A. Irvine
 */
public class A057965 extends AbstractSequence {

  /** Construct the sequence. */
  public A057965() {
    super(4);
  }

  private static final Z Z11 = Z.valueOf(11);
  private int mN = 3;
  private int mM = 3;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 4;
    }
    return Binomial.binomial(mN, mM).multiply(Functions.STIRLING2.z(mM, 4)).multiply(Z11.pow(mN - mM));
  }
}
