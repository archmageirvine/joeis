package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a001.A001413;

/**
 * A010567 2n-step 3-dimensional closed paths on cubic lattice.
 * @author Sean A. Irvine
 */
public class A010567 extends A001413 {

  @Override
  public Z next() {
    return super.next().max(Z.SIX);
  }
}

