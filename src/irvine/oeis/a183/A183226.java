package irvine.oeis.a183;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A183226 Sum of digits of (2^n) in base 5, also sum of digits of (10^n) in base 5.
 * @author Georg Fischer
 */
public class A183226 extends Sequence0 {

  protected Z mTerm;
  
  /** Construct this sequence */
  public A183226() {
    mTerm = Z.ONE;
  }

  @Override
  public Z next() {
    final Z result = Functions.DIGIT_SUM.z(5, mTerm);
    mTerm = mTerm.multiply2();
    return result;
  }
}
