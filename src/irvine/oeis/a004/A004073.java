package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004073 Start with <code>a(1)=1;</code> to get <code>a(n)</code> replace each i in <code>a(n-1)</code> with <code>12...i</code>, then append <code>n</code>.
 * @author Sean A. Irvine
 */
public class A004073 implements Sequence {

  private String mA = "";
  private int mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < mA.length(); ++k) {
      final int limit = mA.charAt(k) - '0';
      for (int i = 1; i <= limit; ++i) {
        sb.append(i);
      }
    }
    sb.append(++mN);
    mA = sb.toString();
    return new Z(mA);
  }

}
