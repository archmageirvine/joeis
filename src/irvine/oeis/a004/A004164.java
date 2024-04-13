package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004164 Sum of digits of n^3.
 * @author Sean Irvine
 */
public class A004164 extends Sequence0 {

  protected long mN;
  protected long mExp;
  
  /** Construct this sequence */
  public A004164() {
    this(3);
  }
  
  /**
   * Generic constructor with parameter
   * @param exp sum the digits of n^exp
   */
  public A004164(final long exp) {
    mN = -1;
    mExp = exp;
  }

  @Override
  public Z next() {
    return Z.valueOf(Functions.DIGIT_SUM.l(Z.valueOf(++mN).pow(mExp)));
  }
}
