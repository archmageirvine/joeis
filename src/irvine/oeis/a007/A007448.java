package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A007448 Knuth's sequence (or Knuth numbers): a(n+1) = 1 + min( 2*a(floor(n/2)), 3*a(floor(n/3)) ).
 * @author Sean A. Irvine
 */
public class A007448 extends MemorySequence {

  @Override
  public Z computeNext() {
    final int n = size() - 1;
    return n == -1 ? Z.ONE : a(n / 2).multiply2().min(a(n / 3).multiply(3)).add(1);
  }
}
