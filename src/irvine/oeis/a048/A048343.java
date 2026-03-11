package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A048343 Number of palindromes of the form k*rev(k), where k is a non-palindromic n-digit number and rev(k) = A004086(k) is the digit reversal of k.
 * @author Sean A. Irvine
 */
public class A048343 extends A002113 {

  private final int[] mCount = new int[100];
  private int mN = 0;
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final Z palin = super.next();
      final FactorSequence fs = Jaguar.factor(palin);
      for (final Z d : fs.divisors()) {
        if (d.mod(10) != 0) { // Avoid leading 0 on reverse
          final Z e = palin.divide(d);
          if (e.compareTo(d) > 0 && e.equals(Functions.REVERSE.z(d))) { // d != e (not palindromic), and d < e for symmetry
            final int len = d.toString().length();
            //System.out.println("Solved: " + palin + " = " + d + " * " + e);
            ++mCount[len];
            if (len > mN) {
              // We will never see a smaller solution
              return Z.valueOf(mCount[mN]);
            }
          }
        }
      }
    }
  }
}
