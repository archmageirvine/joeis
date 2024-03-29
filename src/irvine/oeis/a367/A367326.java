package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-03-06/lambdan at 2024-03-06 21:44

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A367326 a(n) = Sum_{(n - k)|n} k^2.
 * @author Georg Fischer
 */
public class A367326 extends LambdaSequence {

  /** Construct the sequence. */
  public A367326() {
    super(0, n -> (n == 0) ? Z.ZERO : Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(n - d).square()));
  }
}
