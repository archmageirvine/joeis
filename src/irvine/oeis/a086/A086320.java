package irvine.oeis.a086;

import irvine.math.MemoryFunction;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086320 a(n) is the depth of the prime tree formed when 4p +- 3 is applied to the n-th prime and repeatedly to any primes generated from the n-th prime via this process.
 * @author Sean A. Irvine
 */
public class A086320 extends A000040 {

  private final MemoryFunction<Z, Long> mB = new MemoryFunction<>() {
    @Override
    protected Long compute(final Z n) {
      if (!n.isProbablePrime()) {
        return 0L;
      }
      final Z p4 = n.multiply(4);
      return 1 + Math.max(getValue(p4.add(3)), getValue(p4.subtract(3)));
    }
  };

  @Override
  public Z next() {
    return Z.valueOf(mB.getValue(super.next()));
  }
}
