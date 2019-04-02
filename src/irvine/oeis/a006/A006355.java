package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A006355 Number of binary vectors of length n containing no singletons.
 * @author Sean A. Irvine
 */
public class A006355 extends A000045 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().multiply2();
  }
}

