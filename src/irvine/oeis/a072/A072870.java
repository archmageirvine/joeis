package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A072870 A Ramanujan congruence modulo 5^2 related to partition numbers: a(n) = p(25n+24)/25 where p(k) is the k-th partition number.
 * @author Sean A. Irvine
 */
public class A072870 extends LambdaSequence {

  /** Construct the sequence. */
  public A072870() {
    super(1, n -> Functions.PARTITIONS.z(25 * n + 24).divide(25));
  }
}
