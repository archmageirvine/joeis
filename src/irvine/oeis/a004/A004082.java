package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004082.
 * @author Sean A. Irvine
 */
public class A004082 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR n1 = CR.valueOf(mN);
      final CR n = CR.valueOf(++mN);
      if (n1.sin().signum(-32) <= 0 && n.sin().signum(-32) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

