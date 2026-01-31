package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392743 allocated for Benoit Cloitre.
 * @author Sean A. Irvine
 */
public class A392743 extends Sequence0 {

  private final A392736 mS = new A392736();
  private int mN = -1;

  @Override
  public Z next() {
    return mS.a(2 * ++mN + 1 - mS.a(mN).intValue());
  }
}
