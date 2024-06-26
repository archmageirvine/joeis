package irvine.oeis.a161;
// Generated by gen_seq4.pl 2024-05-08/filtpos at 2024-05-08 21:31

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a033.A033676;

/**
 * A161835 Numbers k whose largest divisor &lt;= sqrt(k) is 5.
 * @author Georg Fischer
 */
public class A161835 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A161835() {
    super(1, 1, new A033676(), v -> v.equals(Z.FIVE));
  }
}
