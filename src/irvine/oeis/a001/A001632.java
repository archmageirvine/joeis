package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000230;

/**
 * A001632.
 * @author Sean A. Irvine
 */
public class A001632 extends A000230 {

  private long mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    mN += 2;
    return super.next().add(mN);
  }
}
