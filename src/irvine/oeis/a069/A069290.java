package irvine.oeis.a069;
// manually

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A069290 Sum of square roots of square divisors of n.
 * @author Georg Fischer
 */
public class A069290 implements Sequence {

  protected long mN = 0;
  
  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      if (dd.isSquare()) {
        sum = sum.add(dd.sqrt());
      }
    }
    return sum;
  } 
}
