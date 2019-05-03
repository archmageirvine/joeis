package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014727 Squares of even elements in Pascal's triangle <code>A007318</code>.
 * @author Sean A. Irvine
 */
public class A014727 extends A014428 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
