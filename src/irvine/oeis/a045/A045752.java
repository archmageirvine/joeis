package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045752 4n-1 is composite.
 * @author Sean A. Irvine
 */
public class A045752 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (Z.valueOf(4 * ++mN - 1).isProbablePrime()) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
