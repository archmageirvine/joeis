package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A020991 Largest value of k for which Golay-Rudin-Shapiro sequence A020986(k) = n.
 * @author Sean A. Irvine
 */
public class A020991 extends Sequence1 {

  // n occurs exactly n times in A020986

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long pos = -1;
    final Sequence seq = new A020986();
    while (m != 0) {
      ++pos;
      if (seq.next().longValueExact() == mN) {
        --m;
      }
    }
    return Z.valueOf(pos);
  }
}
