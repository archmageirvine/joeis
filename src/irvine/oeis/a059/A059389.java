package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A059389 Sums of two nonzero Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A059389 extends A000045 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    super.next();
    mA.add(Z.TWO); // avoid need for isEmpty check later
  }
  private Z mF = super.next();

  @Override
  public Z next() {
    while (mA.first().compareTo(mF) >= 0) {
      final Sequence u = new SkipSequence(new A000045(), 2);
      Z fu;
      do {
        fu = u.next();
        mA.add(mF.add(fu));
      } while (!fu.equals(mF));
      mF = super.next();
    }
    return mA.pollFirst();
  }
}
