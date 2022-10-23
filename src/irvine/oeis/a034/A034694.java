package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034694 Smallest prime == 1 (mod n).
 * @author Sean A. Irvine
 */
public class A034694 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z t = Z.ONE;
    do {
      t = t.add(mN);
    } while (!t.isProbablePrime());
    return t;
  }
}

