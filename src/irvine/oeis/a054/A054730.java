package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054730 Odd n such that genus of modular curve X_0(N) is never equal to n.
 * @author Sean A. Irvine
 */
public class A054730 extends A054729 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.isEven());
    return t;
  }
}
