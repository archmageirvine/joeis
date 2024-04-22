package irvine.oeis.a115;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A115101 Number of distinct prime factors of L(n + F(n)) where F(n) is the Fibonacci number and L(n) is the Lucas number and n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A115101 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z n = Functions.LUCAS.z(Fibonacci.fibonacci(mN).intValue() + mN);
    final FactorSequence fs = Jaguar.factor(n);
    if (!fs.isComplete()) {
      System.out.println(mN + " " + n + " -> " + fs);
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(fs.omega());
  }
}

