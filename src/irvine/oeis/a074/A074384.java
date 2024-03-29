package irvine.oeis.a074;
// Generated by gen_seq4.pl 2023-10-16/filtpos at 2023-10-17 20:49

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a084.A084301;

/**
 * A074384 Solutions to mod(sigma(x), 6) = 5.
 * @author Georg Fischer
 */
public class A074384 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074384() {
    super(1, 1, new A084301(), v -> v.equals(Z.FIVE));
  }
}
