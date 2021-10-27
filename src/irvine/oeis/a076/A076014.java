package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A076014 Triangle in which m-th entry of n-th row is m^(n-1). 
 * @author Georg Fischer
 */
public class A076014 extends Triangle {

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Z.valueOf(k + 1).pow(n);
  }
}
