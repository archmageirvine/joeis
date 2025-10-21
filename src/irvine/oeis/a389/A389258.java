package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.a152.A152004;

/**
 * A389258 Values of r for which there is a P-position (p,p,r,r) in 4 X n Chomp with p &gt;= r, sorted by p.
 * @author Sean A. Irvine
 */
public class A389258 extends A152004 {

  @Override
  protected Z select(final long p, final long r) {
    return Z.valueOf(r);
  }
}
