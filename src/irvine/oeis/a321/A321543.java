package irvine.oeis.a321;

import java.util.function.Function;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A321543 a(n) = Sum_{d|n} (-1)^(d-1)*d^2.
 * @author Georg Fischer
 */
public class A321543 implements Sequence {

  protected int mK;
  protected Function<Integer, Z> mF;

  /** Construct the sequence. */
  public A321543() {
    this(2);
  }

  /**
   * Generic constructor with parameter
   * @param expon exponent
   */
  public A321543(final int expon) {
    mF = d -> Z.valueOf(d).pow(expon).multiply((((d - 1) & 1) == 0) ? 1 : -1);
    mK = 0;
  }

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mK, mF);
  }
}
