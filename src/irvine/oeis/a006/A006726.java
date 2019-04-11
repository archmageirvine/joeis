package irvine.oeis.a006;

import irvine.math.Polyomino;
import irvine.math.z.Z;

/**
 * A006726 Number of n-celled polygons with perimeter <code>2n</code> on square lattice.
 * @author Sean A. Irvine
 */
public class A006726 extends A006724 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    long c = 0;
    for (final Polyomino p : mA) {
      if (p.perimeter() == 2 * p.size()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
