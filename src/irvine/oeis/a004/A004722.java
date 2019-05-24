package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004722 Delete all digits 3 from the terms of the sequence of nonnegative integers.
 * @author Sean A. Irvine
 */
public class A004722 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.toString().replace("3", "");
      if (!s.isEmpty()) {
        return new Z(s);
      }
    }
  }
}

