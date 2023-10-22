package irvine.oeis.a059;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a049.A049020;

/**
 * A059098 Triangle T(n,m) = Sum_{i=0..n} Stirling2(n,i)*Product_{j=1..m} (i-j+1), m=0..n.
 * @author Sean A. Irvine
 */
public class A059098 extends A049020 {

  @Override
  public Z next() {
    return super.next().multiply(MemoryFactorial.SINGLETON.factorial(mM));
  }
}

