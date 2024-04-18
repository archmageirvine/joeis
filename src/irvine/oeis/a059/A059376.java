package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059376 Jordan function J_3(n).
 * @author Georg Fischer
 */
public class A059376 extends Sequence1 {

  protected long mN = 0;
  protected int mExp; // exponent k in "J_k"
  
  /** Construct the sequence. */
  public A059376() {
    this(3);
  }
  
  /** 
   * Constructor with parameter
   * @param exp exponent
   */
  public A059376(final int exp) {
    mExp = exp;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(d.pow(mExp).multiply(Functions.MOBIUS.i(mN / d.longValue())));
    }
    return sum;
  }
}
