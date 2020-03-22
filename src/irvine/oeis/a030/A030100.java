package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030100 Cubes whose digits are all odd.
 * @author Sean A. Irvine
 */
public class A030100 extends A030099 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
