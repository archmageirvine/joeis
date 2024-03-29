package irvine.oeis.a091;
// Generated by gen_seq4.pl primen/primenp at 2022-04-05 21:14

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.a060.A060822;

/**
 * A091330 a(n) = ((p-1)!/p) - ((p-1)*(p-1)!/p!), where p is the n-th prime.
 * @author Georg Fischer
 */
public class A091330 extends A060822 {

  /** Construct the sequence. */
  public A091330() {
    super(1, (n, p) -> MemoryFactorial.SINGLETON.factorial(Z.valueOf(p).subtract(Z.ONE)).divide(Z.valueOf(p)).subtract(Z.valueOf(p).subtract(Z.ONE).multiply(MemoryFactorial.SINGLETON.factorial(Z.valueOf(p).subtract(Z.ONE))).divide(MemoryFactorial.SINGLETON.factorial(Z.valueOf(p)))));
  }
}
