package irvine.oeis.a300;
// Generated by gen_seq4.pl 2024-07-13/lambdan at 2024-07-13 23:12

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a019.A019565;

/**
 * A300831 a(n) = Product_{d|n, d&lt;n} A019565(d)^[moebius(n/d) = +1].
 * @author Georg Fischer
 */
public class A300831 extends LambdaSequence {

  private static final DirectSequence A019565 = new A019565();

  /** Construct the sequence. */
  public A300831() {
    super(1, n -> Integers.SINGLETON.productdiv(n, d -> d >= n ? Z.ONE : A019565.a(d).pow(Functions.MOEBIUS.i(n / d) == 1 ? Z.ONE : Z.ZERO)));
  }
}
