package irvine.oeis.a001;

import irvine.math.Polyomino;
import irvine.math.z.Z;
import irvine.oeis.a000.A000105;

/**
 * A001419 Number of n-celled polyominoes with holes.
 * @author Sean A. Irvine
 */
public class A001419 extends A000105 {

  {
    super.next(); // skip 0th term
  }

  @Override
  public Z next() {
    super.next();
    long c = 0;
    for (final Polyomino p : mA) {
      if (p.isHoly()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
