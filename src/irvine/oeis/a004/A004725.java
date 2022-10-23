package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004725 Delete all 6's from the sequence of nonnegative integers.
 * @author Sean A. Irvine
 */
public class A004725 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.toString().replace("6", "");
      if (!s.isEmpty()) {
        return new Z(s);
      }
    }
  }
}

