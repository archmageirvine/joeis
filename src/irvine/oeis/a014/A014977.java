package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a008.A008584;

/**
 * A014977 Expansion of Molien series for automorphism group (2.Weyl(E6)) of E6 lattice.
 * @author Sean A. Irvine
 */
public class A014977 extends A008584 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}
