package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011820 Number of <code>M-sequences m_0,...,m_4</code> with <code>m_1 &lt</code>; n.
 * @author Sean A. Irvine
 */
public class A011820 extends A011804 {

  private long mN = -1;

  @Override
  public Z next() {
    return m(++mN, 4);
  }
}
