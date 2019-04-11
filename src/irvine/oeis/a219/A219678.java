package irvine.oeis.a219;

import irvine.math.z.Z;
import irvine.oeis.a054.A054225;

/**
 * A219678 Number of tripartite partitions of <code>(n,n,n)</code> into triples.
 * @author Sean A. Irvine
 */
public class A219678 extends A054225 {

  private static final Z P = Z.valueOf(30);
  private int mN = -1;

  @Override
  public Z next() {
    final Z r = P.pow(++mN);
    return get(r, r);
  }
}
