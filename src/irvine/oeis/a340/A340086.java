package irvine.oeis.a340;
// Generated by gen_seq4.pl 2024-07-20/lambdin at 2024-07-20 00:09

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A340086 a(1) = 0, for n &gt; 1, a(n) = A000265(n-1) / gcd(n-1, A336466(n)).
 * @author Georg Fischer
 */
public class A340086 extends LambdaSequence {

  private static final DirectSequence A340083 = new A340083();

  /** Construct the sequence. */
  public A340086() {
    super(1, n -> Functions.MAKE_ODD.z(A340083.a(n)), "0");
  }
}
