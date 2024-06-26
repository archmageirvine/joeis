package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A076157 Continued fraction expansion for c=sum_{k&gt;=0} 1/2^(k!).
 * a(3*2^n) = 2^((n+1)*((n+2)!)) - 1
 * @author Georg Fischer
 */
public class A076157 extends FoldedContinuedFraction {

  /** Construct the sequence */
  public A076157() {
    super(0, k -> Z.TWO.pow(Functions.FACTORIAL.z(k).multiply(k - 1)), 1, 3, 1, 3, 4);
    setOffset(1);
    setStart(2);
  }
}
