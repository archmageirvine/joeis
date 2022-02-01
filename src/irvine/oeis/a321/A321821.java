package irvine.oeis.a321;

import java.util.function.Function;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A321821 a(n) = Sum_{d|n, d==1 mod 4} d^5 - Sum_{d|n, d==3 mod 4} d^5.
 * @author Georg Fischer
 */
public class A321821 implements Sequence {

  protected int mK;
  protected Function<Integer, Z> mF;
  protected Function<Integer, Z> mG;

  /** Construct the sequence. */
  public A321821() {
    this(5);
  }

  /**
   * Generic constructor with parameter
   * @param expon exponent
   */
  public A321821(final int expon) {
    mF = d -> (d % 4 == 1) ? Z.valueOf(d).pow(expon) : Z.ZERO;
    mG = d -> (d % 4 == 3) ? Z.valueOf(d).pow(expon) : Z.ZERO;
    mK = 0;
  }

  @Override
  public Z next() {
    ++mK;
    return Integers.SINGLETON.sumdiv(mK, mF).subtract(Integers.SINGLETON.sumdiv(mK, mG));
  }
}
