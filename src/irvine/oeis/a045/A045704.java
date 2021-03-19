package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A045704 Numbers of the form F(i)^2 + F(j)^3, where F() are Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A045704 extends A000045 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mF = super.next();
  private Z mF2 = mF.square();

  @Override
  public Z next() {
    while (mA.isEmpty() || mF2.compareTo(mA.first()) <= 0) {
      final Sequence fibo = new A000045();
      final Z f3 = mF.pow(3);
      Z f;
      do {
        f = fibo.next();
        mA.add(mF2.add(f.pow(3)));
        mA.add(f3.add(f.square()));
      } while (!f.equals(mF));
      mF = super.next();
      mF2 = mF.square();
    }
    return mA.pollFirst();
  }
}
