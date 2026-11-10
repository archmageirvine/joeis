package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087331 Smallest number with all identical digits having n distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A087332 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    while (true) {
      ++s;
      final StringBuilder sb = new StringBuilder();
      for (long k = 0; k < mN; ++k) {
        sb.append(2 * (s + k));
      }
      sb.append(0);
      final Z t = new Z(sb);
      final Z t1 = t.add(1);
      if (t1.isProbablePrime()) {
        return t1;
      }
      final Z t3 = t.add(3);
      if (t3.isProbablePrime()) {
        return t3;
      }
      final Z t7 = t.add(7);
      if (t7.isProbablePrime()) {
        return t7;
      }
      final Z t9 = t.add(9);
      if (t9.isProbablePrime()) {
        return t9;
      }
    }
  }
}
