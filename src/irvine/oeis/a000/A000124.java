package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000124 Central polygonal numbers (the Lazy Caterer's <code>sequence): n(n+1)/2 + 1</code>; or, maximal number of pieces formed when slicing a pancake with n cuts.
 * @author Sean A. Irvine
 */
public class A000124 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).divide2().add(1);
  }
}

