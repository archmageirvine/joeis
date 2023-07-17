package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A054009 n read modulo (number of proper divisors of n).
 * @author Sean A. Irvine
 */
public class A054009 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A054009(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A054009() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(++mN % (Jaguar.factor(mN).sigma0AsLong() - 1));
  }
}
