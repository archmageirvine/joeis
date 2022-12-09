package irvine.oeis.a176;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;

/**
 * A176266 Binomial(prime(n),s)/prime(n) where s is the sum of the decimal digits of n.
 * @author Georg Fischer
 */
public class A176266 extends AbstractSequence {

  private int mN = 0;
  private A000040 mSeq1 = new A000040();

  /** Construct the sequence. */
  public A176266() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z p = mSeq1.next();
    return Binomial.binomial(p.intValue(), ZUtils.digitSum(mN)).divide(p);
  }
}
