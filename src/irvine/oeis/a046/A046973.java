package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A046973 Primes of the form F(i)^3 + F(j)^4, where F() are Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A046973 extends A000045 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    super.next();
    super.next();
  }
  private Z mF = super.next();
  private Z mF3 = mF.pow(3);

  private void add(final Z n) {
    if (n.isProbablePrime()) {
      mA.add(n);
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mF3) > 0) {
      final Sequence f = new SkipSequence(new A000045(), 2);
      final Z mf4 = mF3.multiply(mF);
      for (Z t = f.next(); t.compareTo(mF) <= 0; t = f.next()) {
        add(mF3.add(t.pow(4)));
        add(mf4.add(t.pow(3)));
      }
      mF = super.next();
      mF3 = mF.pow(3);
    }
    return mA.pollFirst();
  }
}
