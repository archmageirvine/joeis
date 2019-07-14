package irvine.oeis.a309;

import irvine.math.cr.CR;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A309076.
 * @author Sean A. Irvine
 */
public class A309076 implements Sequence {

  private static final CR LN_PHI = CR.PHI.log();
  private static final CR SQRT5 = CR.FIVE.sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    long n = ++mN;
    while (n > 0) {
      final int k = SQRT5.multiply(CR.valueOf(n)).add(CR.HALF).log().divide(LN_PHI).floor().intValueExact();
      n -= Fibonacci.fibonacci(k).longValueExact();
      sum = sum.add(Fibonacci.fibonacci(1 - k));
    }
    return sum;
  }
}

/*
 def a309076(n):

    result = 0

    lnphi = ln((1+sqrt(5))/2)

    while n > 0:

        k = floor(ln(n*sqrt(5)+1/2)/lnphi)

        n = n - fibonacci(k)

        result = result + fibonacci(1 - k)

    return result
 */
