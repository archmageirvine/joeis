package irvine.oeis.a082;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.function.Functions;
import irvine.oeis.a179.A179930;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A082069 Smallest common prime-divisor of n and Sigma_2(n) = A001157(n); a(n) = 1 if no common prime-divisor exists.
 * @author Georg Fischer
 */
public class A082069 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A082069() {
    super(1, new A179930(), v -> Functions.LPF.z(v));
  }
}
