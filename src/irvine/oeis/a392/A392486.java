package irvine.oeis.a392;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A392486 Number of n X n Boolean matrices having at least one zero row and at least one zero column.
 * @author Sean A. Irvine
 */
public class A392486 extends A392483 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN * mN, k -> super.next());
  }
}

