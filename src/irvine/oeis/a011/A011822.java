package irvine.oeis.a011;

import irvine.math.z.Z;

/**
 * A011822 M-sequences m_0,...,m_6 with m_1 &lt; n.
 * @author Sean A. Irvine
 */
public class A011822 extends A011804 {

  /** Construct the sequence. */
  public A011822() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return m(++mN, 6);
  }
}
