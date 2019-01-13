package irvine.oeis.a007;

import java.util.Collections;

import irvine.math.z.Z;
import irvine.oeis.a051.A051424;

/**
 * A007360.
 * @author Sean A. Irvine
 */
public class A007360 extends A051424 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return b(mN, mN, Collections.emptySet())
      .subtract(b(mN - 2, mN - 2, Collections.emptySet()));
  }
}
