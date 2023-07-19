package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011825 M-sequences m_0,...,m_9 with m_1 &lt; n.
 * @author Sean A. Irvine
 */
public class A011825 extends A011804 {

  /** Construct the sequence. */
  public A011825() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return m(++mN, 9);
  }
}
