package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002113;

/**
 * A048344 a(n) * a(n)_reversed is a palindrome (and a(n) is not palindromic).
 * @author Sean A. Irvine
 */
public class A048344 extends A002113 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.last().toString().length() == mA.first().toString().length()) {
      final Z palin = super.next();
      final FactorSequence fs = Jaguar.factor(palin);
      for (final Z d : fs.divisors()) {
        if (d.mod(10) != 0) { // Avoid leading 0 on reverse
          final Z e = palin.divide(d);
          if (e.compareTo(d) > 0 && e.equals(ZUtils.reverse(d))) { // d != e (not palindromic), and d < e for symmetry
            mA.add(d);
            mA.add(e);
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
