package irvine.oeis.a198;

import irvine.math.z.Z;
import irvine.oeis.a205.A205406;

/**
 * A198293 a(n) = (1/n)*A205406(n).
 * @author Georg Fischer
 */
public class A198293 extends A205406 {

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
