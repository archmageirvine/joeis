package irvine.oeis.a365;
// Generated by gen_seq4.pl known4/simtraf at 2023-10-15 18:28

import irvine.math.function.Functions;
import irvine.oeis.a016.A016933;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A365412 a(n) = sigma(6*n+2). Sum of the divisors of 6*n+2, n &gt;= 0.
 * @author Georg Fischer
 */
public class A365412 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A365412() {
    super(0, new A016933(), v -> Functions.SIGMA1.z(v));
  }
}
