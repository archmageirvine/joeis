package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011825 M-sequences <code>m_0,...,m_9</code> with <code>m_1 &lt</code>; n.
 * @author Sean A. Irvine
 */
public class A011825 extends A011804 {

  private long mN = -1;

  @Override
  public Z next() {
    return m(++mN, 9);
  }
}
