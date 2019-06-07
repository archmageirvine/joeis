package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004177 Omit <code>2</code>'s from <code>n</code>.
 * @author Sean A. Irvine
 */
public class A004177 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN).replace("2", "");
    return s.isEmpty() ? Z.ZERO : new Z(s);
  }
}
