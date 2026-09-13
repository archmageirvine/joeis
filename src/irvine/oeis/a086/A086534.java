package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A086534 Smallest prime p sandwiched between two numbers that are divisible by n-th powers.
 * @author Sean A. Irvine
 */
public class A086534 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    final Sequence s = new TwoParameterFormSequence(1, 1, 1, (x, y) -> Functions.PRIME.z(x).pow(mN).multiply(y));
    Z t = s.next();
    while (true) {
      final Z u = t;
      t = s.next();
      if (t.subtract(u).equals(Z.TWO) && u.add(1).isProbablePrime()) {
        return u.add(1);
      }
    }
  }
}

