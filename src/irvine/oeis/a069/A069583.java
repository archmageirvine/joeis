package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069583 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder forward = new StringBuilder();
    final StringBuilder reverse = new StringBuilder();
    forward.append('1');
    reverse.append('1');
    long k = 0;
    while (true) {
      k += mN;
      final Z t = new Z(forward.toString() + k + reverse);
      if (t.isProbablePrime()) {
        return t;
      }
      forward.append(k);
      reverse.insert(0, k);
    }
  }
}
