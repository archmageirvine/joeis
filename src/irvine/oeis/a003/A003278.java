package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003278.
 * @author Sean A. Irvine
 */
public class A003278 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN), 3).add(1);
  }

}
