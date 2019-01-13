package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011820.
 * @author Sean A. Irvine
 */
public class A011820 extends A011804 {

  private long mN = -1;

  @Override
  public Z next() {
    return m(++mN, 4);
  }
}
