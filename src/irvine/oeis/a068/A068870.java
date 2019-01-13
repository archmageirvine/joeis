package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a255.A255487;

/**
 * A068870.
 * @author Sean A. Irvine
 */
public class A068870 extends A255487 {

  @Override
  public Z next() {
    final Z c = super.next();
    long sym = 0;
    for (final PackedPolyomino p : mPolysB) {
      if (p.isSymmetric()) {
        ++sym;
      }
    }
    return Z.ONE.max(c.add(sym).divide2());
  }
}
