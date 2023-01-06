package irvine.oeis.a359;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A359212 Number of divisors of 3*n-2 of form 3*k+1.
 * @author Georg Fischer
 */
public class A359212 extends Sequence1 {

  private int mN;
  private int mMul1;
  private int mAdd1;
  private int mMul2;
  private int mAdd2;

  /** Construct the sequence. */
  public A359212() {
    this(3, -2, 3, +1);
  }

  /**
   * Generic constructor with parameters
   * @param mul1 first multiplicator
   * @param add1 first addition
   * @param mul2 second mutliplicator
   * @param add2 second addition
   */
  public A359212(final int mul1, final int add1, final int mul2, final int add2) {
    mN = 0;
    mMul1 = mul1;
    mAdd1 = add1;
    mMul2 = mul2;
    mAdd2 = add2;
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mMul1 * mN + mAdd1, d -> d % mMul2 == mAdd2 ? Z.ONE : Z.ZERO);
  }
}
