package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000740;

/**
 * A006876 Mu-molecules in Mandelbrot set whose seeds have period <code>n</code>.
 * @author Sean A. Irvine
 */
public class A006876 extends A006875 {

  private final A000740 mA = new A000740();

  @Override
  public Z next() {
    return mA.next().subtract(super.next());
  }
}
