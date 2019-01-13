package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004176.
 * @author Sean A. Irvine
 */
public class A004176 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN).replace("1", "");
    return s.isEmpty() ? Z.ZERO : new Z(s);
  }
}
