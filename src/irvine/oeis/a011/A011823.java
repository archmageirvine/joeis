package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011823 <code>M-sequences m_0,...,m_7</code> with <code>m_1 &lt; n</code>.
 * @author Sean A. Irvine
 */
public class A011823 extends A011804 {

  private long mN = -1;

  @Override
  public Z next() {
    return m(++mN, 7);
  }
}
