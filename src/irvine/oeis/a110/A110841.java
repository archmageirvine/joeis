package irvine.oeis.a110;
// Generated by gen_seq4.pl 2024-07-20/sintrif at 2024-07-20 00:09

import irvine.math.function.Functions;
import irvine.oeis.a014.A014509;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A110841 a(n) is the number of prime factors, with multiplicity, of abs(A014509(n)).
 * @author Georg Fischer
 */
public class A110841 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A110841() {
    super(0, (term, n) -> Functions.BIG_OMEGA.z(term.abs()), "", new A014509());
  }
}
