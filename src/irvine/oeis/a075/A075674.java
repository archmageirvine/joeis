package irvine.oeis.a075;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a072.A072569;

/**
 * A075674 Sum of next n odd interprimes.
 * @author Sean A. Irvine
 */
public class A075674 extends A072569 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
