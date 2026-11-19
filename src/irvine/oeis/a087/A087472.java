package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087472 Number of iterations required for the function f(n) to reach a single digit, where f(n) is the product of the two numbers formed from the alternating digits of n.
 * @author Sean A. Irvine
 */
public class A087472 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = -1;
    Z t = Z.valueOf(++mN);
    Z u;
    do {
      u = t;
      t = A087471.murphyProduct(t);
      ++cnt;
    } while (!t.equals(u));
    return Z.valueOf(cnt);
  }
}
