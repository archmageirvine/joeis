package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a068.A068870;
import irvine.oeis.a290.A290305;

/**
 * A006768.
 * @author Sean A. Irvine
 */
public class A006768 extends A290305 {

  private final A068870 mA = new A068870();

  {
    next(); // skip 0th term
  }

  @Override
  public Z next() {
    final Z c = super.next();
    long sym = 0;
    for (final FiveDPackedPolyomino p : mPolysB) {
      if (p.isSymmetric()) {
        ++sym;
      }
    }
    return Z.ONE.max(c.add(sym).divide2()).subtract(mA.next());
  }
}
