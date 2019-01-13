package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005091.
 * @author Sean A. Irvine
 */
public class A005091 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z p : Cheetah.factor(++mN).toZArray()) {
      if (p.mod(4) == 3) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

