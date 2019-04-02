package irvine.oeis.a006;

import irvine.math.Polyomino;
import irvine.math.z.Z;

/**
 * A006725 Number of n-celled polygons with perimeter 2n+2 on square lattice.
 * @author Sean A. Irvine
 */
public class A006725 extends A006724 {

  @Override
  public Z next() {
    super.next();
    long c = 0;
    for (final Polyomino p : mA) {
      if (p.perimeter() == 2 * p.size() + 2) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
