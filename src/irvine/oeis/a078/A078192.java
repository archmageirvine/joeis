package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A078192 a(n) = floor(concatenation of n down to 1 divided by n).
 * @author Sean A. Irvine
 */
public class A078192 extends A000422 {

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}

