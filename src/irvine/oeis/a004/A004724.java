package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004724 Delete all <code>5</code>'s from the sequence of nonnegative integers.
 * @author Sean A. Irvine
 */
public class A004724 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.toString().replace("5", "");
      if (!s.isEmpty()) {
        return new Z(s);
      }
    }
  }
}

