package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395770 allocated for Tanya Khovanova.
 * @author Sean A. Irvine
 */
public class A395770 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(10 * ++mN - 5 + ((mN & 1) == 1 ? -1 : 1)).shiftLeft(mN - 5);
  }
}
