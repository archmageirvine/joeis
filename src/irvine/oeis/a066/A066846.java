package irvine.oeis.a066;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066846 Numbers of the form a^a + b^b, a &gt;= b &gt; 0.
 * @author Sean A. Irvine
 */
public class A066846 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    final Z aa = Z.valueOf(mN).pow(mN);
    if (mA.isEmpty() || mA.first().compareTo(aa) > 0) {
      for (long k = 1; k <= mN; ++k) {
        mA.add(aa.add(Z.valueOf(k).pow(k)));
      }
      ++mN;
    }
    return mA.pollFirst();
  }
}
