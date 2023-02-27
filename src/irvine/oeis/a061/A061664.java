package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A061664 Smallest number a(n) for which a(n) and a(n)^2 contain the same digits in the same proportion in base n.
 * @author Sean A. Irvine
 */
public class A061664 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    return new A061657(++mN).next();
  }
}

