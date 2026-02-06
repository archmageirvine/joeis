package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392743 a(n) = A392736(2*n + 1 - A392736(n)).
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
