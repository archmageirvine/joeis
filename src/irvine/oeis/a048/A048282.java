package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a025.A025046;

/**
 * A048282 Beginning of n consecutive quadratic residues mod A025046(n).
 * @author Sean A. Irvine
 */
public class A048282 extends A025046 {

  @Override
  protected Z select(final long p, final long least) {
    return Z.valueOf(least);
  }
}

