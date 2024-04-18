package irvine.oeis.a054;

import java.util.function.Function;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054718 Number of ternary sequences with primitive period n.
 * a(n) = Sum_{d|n} mu(d)*3^(n/d).
 * @author Georg Fischer
 */
public class A054718 extends Sequence0 {

  protected Z mBase;
  protected int mN;
  protected Function<Integer, Z> mF;

  /** Construct the sequence. */
  public A054718() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param base
   */
  public A054718(final int base) {
    mBase = Z.valueOf(base);
    mF = d -> mBase.pow(mN / d).multiply(Functions.MOBIUS.i((long) d));
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sumdiv(mN, mF);
  }
}
