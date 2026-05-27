package irvine.oeis.a382;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024619;
import irvine.oeis.a381.A381801;

/**
 * A382438 Numbers k in A024619 such that all residues r (mod k) in row k of A381801 are such that rad(r) divides k, where rad = A007947.
 * @author Sean A. Irvine
 */
public class A382438 extends A024619 {

  private boolean is(final long m) {
    for (final Z r : A381801.row(m)) {
      if (m % Functions.RAD.l(r) != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z m = super.next();
      if (is(m.longValueExact())) {
        return m;
      }
    }
  }
}
