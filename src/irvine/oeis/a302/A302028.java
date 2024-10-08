package irvine.oeis.a302;
// Generated by gen_seq4.pl 2024-09-22.ack/lambdan at 2024-09-22 22:36

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a057.A057889;

/**
 * A302028 Permutation of nonnegative integers: a(0) = 0; for n &gt;= 1, a(n) = 1+A057889(A057889(n)-1), where A057889 is a bijective bit-reverse.
 * @author Georg Fischer
 */
public class A302028 extends LambdaSequence {

  private static final DirectSequence A057889 = new A057889();

  /** Construct the sequence. */
  public A302028() {
    super(0, n -> (n <= 0) ? Z.ZERO : Z.ONE.add(A057889.a(A057889.a(n).subtract(1))));
  }
}
