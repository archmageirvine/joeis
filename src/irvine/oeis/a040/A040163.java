package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A040163.
 * @author Sean A. Irvine
 */
public class A040163 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    return Z.valueOf(Math.abs(s.charAt(0) - s.charAt(s.length() - 1)));
  }
}
