package irvine.oeis.a066;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066847 Integers of the form m! + n!, m and n = positive integers.
 * @author Sean A. Irvine
 */
public class A066847 extends Sequence0 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 1;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(mN);
    if (mA.isEmpty() || mA.first().compareTo(f) > 0) {
      for (int k = 1; k <= mN; ++k) {
        mA.add(f.add(Functions.FACTORIAL.z(k)));
      }
      ++mN;
    }
    return mA.pollFirst();
  }
}
