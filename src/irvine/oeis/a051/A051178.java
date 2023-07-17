package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a027.A027423;

/**
 * A051178 Numbers k such that k divides the number of divisors of k!.
 * @author Sean A. Irvine
 */
public class A051178 extends A027423 {

  /** Construct the sequence. */
  public A051178() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
