package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011821 Number of M-sequences m_0,...,m_5 with m_1 &lt; n.
 * @author Sean A. Irvine
 */
public class A011821 extends A011804 {

  private long mN = -1;

  @Override
  public Z next() {
    return m(++mN, 5);
  }
}
