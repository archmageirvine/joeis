package irvine.oeis.a006;

import irvine.math.Polyomino;
import irvine.math.z.Z;
import irvine.oeis.a000.A000105;

/**
 * A006749.
 * @author Sean A. Irvine
 */
public class A006749 extends A000105 {

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    long c = 0;
    for (final Polyomino p : mA) {
      if (p.rotate180().translate().equals(p)
        || p.reflectHorizontal().translate().equals(p)
        || p.reflectVertical().translate().equals(p)
        || p.swap().translate().equals(p)
        || p.swap().rotate180().translate().equals(p)
        || p.rotate90().translate().equals(p)
        || p.rotate270().translate().equals(p)) {
        continue;
      }
      ++c;
    }
    return Z.valueOf(c);
  }
}
