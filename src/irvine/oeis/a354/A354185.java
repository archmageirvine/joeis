package irvine.oeis.a354;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a348.A348717;

/**
 * A354185 M\u00f6bius transform of A348717.
 * @author Georg Fischer
 */
public class A354185 extends LambdaSequence {

  private static final DirectSequence A348717 = new A348717();

  /** Construct the sequence. */
  public A354185() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Functions.MOBIUS.z(n / d).multiply(A348717.a(d))));
  }
}
