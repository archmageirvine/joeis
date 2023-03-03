package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A061664 a(n) is the smallest number k &gt;= 2 for which k and k^2 contain the same digits in the same proportion in base n.
 * @author Sean A. Irvine
 */
public class A061664 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    return new A061657(++mN).next();
  }
}

