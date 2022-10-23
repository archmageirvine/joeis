package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048379 Apply the transformation 0-&gt;1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6-&gt;7-&gt;8-&gt;9-&gt;0 to digits of n.
 * @author Sean A. Irvine
 */
public class A048379 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    long m = ++mN;
    do {
      final long r = m % 10;
      sb.append(r == 9 ? '0' : (char) ('1' + r));
      m /= 10;
    } while (m != 0);
    return new Z(sb.reverse());
  }
}
