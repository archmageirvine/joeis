package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001358;

/**
 * A085816 Semiprimes such that the sum of the factorials of the digits is also semiprime.
 * @author Sean A. Irvine
 */
public class A085816 extends FilterSequence {

  /** Construct the sequence. */
  public A085816() {
    super(1, new A001358(), k -> {
      final int[] cnts = ZUtils.digitCounts(k);
      Z sum = Z.ZERO;
      for (int j = 0; j < cnts.length; ++j) {
        sum = sum.add(Functions.FACTORIAL.z(j).multiply(cnts[j]));
      }
      return Predicates.SEMIPRIME.is(sum);
    });
  }
}
