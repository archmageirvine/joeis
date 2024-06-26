package irvine.oeis.a365;
// Generated by gen_seq4.pl known4/simtraf at 2023-10-15 18:28

import irvine.math.function.Functions;
import irvine.oeis.a016.A016957;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A365414 a(n) = sigma(6*n+4). Sum of the divisors of 6*n+4, n &gt;= 0.
 * @author Georg Fischer
 */
public class A365414 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A365414() {
    super(0, new A016957(), v -> Functions.SIGMA1.z(v));
  }
}
