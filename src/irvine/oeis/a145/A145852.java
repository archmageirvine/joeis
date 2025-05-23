package irvine.oeis.a145;
// Generated by gen_seq4.pl 2025-04-30.ack/filprof at 2025-04-30 23:37

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;
import irvine.util.string.StringUtils;

/**
 * A145852 Primes of the form k followed by a 0 and k 9's.
 * @author Georg Fischer
 */
public class A145852 extends FilterSequence {

  /** Construct the sequence. */
  public A145852() {
    super(1, new LambdaSequence(0, k -> new Z(Integer.toString(k) + "0" + StringUtils.rep('9', k))), PRIME);
  }
}
