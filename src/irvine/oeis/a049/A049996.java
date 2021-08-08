package irvine.oeis.a049;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;

/**
 * A049996 a(n) is the index k such that F(k)=d(n), where d=A049874 (difference sequence of ordered products of Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A049996 extends A049874 {

  @Override
  public Z next() {
    return Z.valueOf(Fibonacci.inverseFibonacci(super.next()));
  }
}

