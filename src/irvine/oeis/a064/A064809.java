package irvine.oeis.a064;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A064809 Decimal expansion of Pi written as a sequence of positive integers avoiding duplicates.
 * @author Sean A. Irvine
 */
public class A064809 extends A000796 {

  private final HashSet<String> mSeen = new HashSet<>();
  private Z mA = super.next();

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    while (true) {
      sb.append(mA);
      mA = super.next();
      if (!mA.isZero() && mSeen.add(sb.toString())) {
        return new Z(sb);
      }
    }
  }
}

