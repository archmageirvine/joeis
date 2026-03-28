package irvine.oeis.a393;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a386.A386016;

/**
 * A393161 A sequence constructed by greedily sampling the Hermite distribution, with both parameters as 1, to minimize ratio discrepancy. The distribution indexing is adjusted to be strictly decreasing and support all positive integers.
 * @author Sean A. Irvine
 */
public class A393161 extends A386016 {

  /** Construct the sequence. */
  public A393161() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return new CR() {
          @Override
          protected Z approximate(final int precision) {
            final Z one = CR.ONE.getApprox(precision);
            Z sum = Z.ZERO;
            for (long k = 0; k <= (n + 1) / 2; ++k) {
              final Z t = one.divide(Functions.FACTORIAL.z(k).multiply(Functions.FACTORIAL.z(n + 1 - 2 * k)));
              sum = sum.add(t);
            }
            return sum;
          }
        };
      }
    });
  }
}

