package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004177 Omit 2's from n.
 * @author Sean A. Irvine
 */
public class A004177 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN).replace("2", "");
    return s.isEmpty() ? Z.ZERO : new Z(s);
  }
}
