package irvine.oeis.a394;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a106.A106039;

/**
 * A394690 Smallest k such that k * n is a Belgian-0 number.
 * @author Sean A. Irvine
 */
public class A394690 extends Sequence1 {

  private long mN = 0;
  private final Sequence mB = new A106039();
  private final TreeSet<Long> mBelgian = new TreeSet<>();
  {
    mBelgian.add(mB.next().longValueExact());
  }

  private boolean isBelgian0(final long n) {
    while (n > mBelgian.last()) {
      mBelgian.add(mB.next().longValueExact());
    }
    return mBelgian.contains(n);
  }

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (!isBelgian0(++k * mN)) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
