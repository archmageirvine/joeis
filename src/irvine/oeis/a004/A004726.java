package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004726 Delete all 7's from the sequence of nonnegative integers.
 * @author Sean A. Irvine
 */
public class A004726 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.toString().replace("7", "");
      if (!s.isEmpty()) {
        return new Z(s);
      }
    }
  }
}

