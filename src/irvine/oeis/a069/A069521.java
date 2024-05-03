package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a043.A043292;

/**
 * A069521 Smallest multiple of n with digit sum = 2, or 0 if no such number exists, e.g., a(3k)=0.
 * @author Sean A. Irvine
 */
public class A069521 extends Sequence1 {

  // After Robert Israel

  private int mN = 0;
  private final TreeSet<Long> mA = new TreeSet<>();
  private final Sequence mA043292 = new A043292();
  {
    mA.add(mA043292.next().longValueExact()); // Avoid need for isEmpty check later
  }
  private final DirectSequence mB = DirectSequence.create(new A069531());

  @Override
  public Z next() {
    ++mN;
    long m = mN;
    int a = 0;
    while ((m & 1) == 0) {
      m >>>= 1;
      ++a;
    }
    int b = 0;
    while (m % 5 == 0) {
      m /= 5;
      ++b;
    }
    if (m == 1) {
      return Z.TEN.pow(Math.max(a - 1, b)).multiply2();
    }
    while (m > mA.last()) {
      mA.add(mA043292.next().longValueExact());
    }
    if (mA.contains(m)) {
      return Z.TEN.pow(Math.max(a, b)).multiply(Z.TEN.pow(mB.a(Z.valueOf(m))).add(1));
    }
    return Z.ZERO;
  }
}
