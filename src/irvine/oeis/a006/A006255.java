package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a092.A092487;

/**
 * A006255.
 * @author Sean A. Irvine
 */
public class A006255 extends A092487 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
