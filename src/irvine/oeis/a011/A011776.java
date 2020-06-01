package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011776 <code>a(1) = 1;</code> for <code>n &gt; 1, a(n)</code> is defined by the property that <code>n^a(n)</code> divides <code>n!</code> but <code>n^(a(n)+1)</code> does not.
 * @author Sean A. Irvine
 */
public class A011776 implements Sequence {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long c = 0;
    mF = mF.multiply(mN);
    Z m = Z.valueOf(mN);
    do {
      m = m.multiply(mN);
      ++c;
    } while (Z.ZERO.equals(mF.mod(m)));
    return Z.valueOf(c);
  }
}
