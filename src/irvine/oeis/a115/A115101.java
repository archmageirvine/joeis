package irvine.oeis.a115;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

/**
 * A115101 Number of distinct prime factors of <code>L(n + F(n))</code> where <code>F(n)</code> is the Fibonacci number and <code>L(n)</code> is the Lucas number and <code>n &gt;= 1</code>.
 * @author Sean A. Irvine
 */
public class A115101 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z n = Fibonacci.lucas(Fibonacci.fibonacci(mN).intValue() + mN);
    final FactorSequence fs = Jaguar.factor(n);
    if (!fs.isComplete()) {
      System.out.println(mN + " " + n + " -> " + fs);
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(fs.omega());
  }
}

