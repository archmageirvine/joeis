package irvine.oeis.a113;
// Generated by gen_seq4.pl 2024-04-09/lpf at 2024-04-09 23:00

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A113972 Define b(0)=28, b(n+1)=2*b(n)+1; sequence gives largest prime factor of b(n).
 * @author Georg Fischer
 */
public class A113972 extends LambdaSequence {

  /** Construct the sequence. */
  public A113972() {
    super(0, n -> Functions.GPF.z(Z.TWO.pow(n).multiply(29).subtract(1)));
  }
}
