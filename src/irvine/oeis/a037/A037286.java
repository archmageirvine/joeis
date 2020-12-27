package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037286.
 * @author Sean A. Irvine
 */
public class A037286 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final StringBuilder sb = new StringBuilder();
    for (final Z d : Cheetah.factor(mN).divisorsSorted()) {
      sb.append(d);
    }
    return new Z(sb);
  }
}

