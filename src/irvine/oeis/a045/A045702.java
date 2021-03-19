package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A045702 Sums of two squares of Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A045702 extends A000045 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mF = super.next();
  private Z mF2 = mF.square();

  @Override
  public Z next() {
    while (mA.isEmpty() || mF2.compareTo(mA.first()) <= 0) {
      final Sequence fibo = new A000045();
      Z f;
      do {
        f = fibo.next();
        mA.add(mF2.add(f.square()));
      } while (!f.equals(mF));
      mF = super.next();
      mF2 = mF.square();
    }
    return mA.pollFirst();
  }
}
