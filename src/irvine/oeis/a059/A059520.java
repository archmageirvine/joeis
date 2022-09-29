package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A059520 Number of partitions into distinct parts, with some sub-partitions having equal sums. Partition(n) = [a, b, c...] where 2n = 2^a + 2^b + 2^c + ...
 * @author Sean A. Irvine
 */
public class A059520 extends ComplementSequence {

  /** Construct the sequence. */
  public A059520() {
    super(new A059519(), Z.ONE);
  }
}
