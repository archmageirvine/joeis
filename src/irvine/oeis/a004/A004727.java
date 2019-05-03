package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004727 Delete all <code>8</code>'s from the sequence of nonnegative integers.
 * @author Sean A. Irvine
 */
public class A004727 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.toString().replace("8", "");
      if (!s.isEmpty()) {
        return new Z(s);
      }
    }
  }
}

