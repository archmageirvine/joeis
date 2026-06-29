package irvine.oeis.a081;
// manually 2026-06-29*

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a001.A001223;

/**
 * A081414 Largest prime divisor of prime(2^n+1) - prime(2^n).
 * @author Georg Fischer
 */
public class A081414 extends LambdaSequence {

  private static final DirectSequence A001223 = new A001223();

  /** Construct the sequence. */
  public A081414() {
    super(0, n -> Functions.GPF.z(A001223.a(Z.TWO.pow(n))));
  }
}
