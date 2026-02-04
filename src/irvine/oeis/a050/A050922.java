package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050922 Triangle in which n-th row gives prime factors of n-th Fermat number 2^(2^n)+1.
 * @author Sean A. Irvine
 */
public class A050922 extends Sequence0 {

  private Z[] mA = {};
  private int mN = -1;
  private int mM = 0;
  private final Z mBase;

  protected A050922(final long base) {
    mBase = Z.valueOf(base);
  }

  /** Construct the sequence. */
  public A050922() {
    this(2);
  }

  @Override
  public Z next() {
    if (++mM >= mA.length) {
      mA = Jaguar.factor(mBase.pow(1L << ++mN).add(1)).toZArray();
      mM = 0;
    }
    return mA[mM];
  }
}
