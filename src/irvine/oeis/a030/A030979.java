package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A030979 Numbers k such that binomial(2k,k) is not divisible by 3, 5 or 7.
 * @author Sean A. Irvine
 */
public class A030979 extends A000984 {

  /** Construct the sequence. */
  public A030979() {
    super(1);
  }

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(3) == 0 || t.mod(5) == 0 || t.mod(7) == 0);
    return Z.valueOf(mN);
  }
}
