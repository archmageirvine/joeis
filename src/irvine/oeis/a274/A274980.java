package irvine.oeis.a274;
// Generated by gen_seq4.pl 2024-05-25/lambdan at 2024-05-25 23:20

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a001.A001223;

/**
 * A274980 Denominator of the alternating n-th partial sum of the reciprocals of the successive prime gaps.
 * @author Georg Fischer
 */
public class A274980 extends LambdaSequence {

  private static final DirectSequence A001223 = new A001223();

  /** Construct the sequence. */
  public A274980() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, i -> new Q(Z.NEG_ONE.pow(i - 1), A001223.a(i))).den());
  }
}
