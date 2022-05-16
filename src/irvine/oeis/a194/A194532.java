package irvine.oeis.a194;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.a007.A007434;

/**
 * A194532 Jordan function ratio J_6(n)/J_2(n).
 * @author Georg Fischer
 */
public class A194532 extends A007434 {

  protected long mN = 0;
  protected int mExp; // exponent k in "J_k"
  
  /** Construct the sequence. */
  public A194532() {
    this(6);
  }
  
  /** 
   * Constructor with parameter
   * @param exp exponent
   */
  public A194532(final int exp) {
    mExp = exp;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(d.pow(mExp).multiply(Mobius.mobius(mN / d.longValue())));
    }
    return sum.divide(super.next());
  }
}
