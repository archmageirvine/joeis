package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004183 Omit 8's from n.
 * @author Sean A. Irvine
 */
public class A004183 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN).replace("8", "");
    return s.isEmpty() ? Z.ZERO : new Z(s);
  }
}
