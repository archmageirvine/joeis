package irvine.oeis.a229;
// Generated by gen_seq4.pl 2024-04-09/lpf at 2024-04-09 23:00

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A229767 Largest prime factor of 2^(2*n+1)-2^(n+1)+1.
 * @author Georg Fischer
 */
public class A229767 extends LambdaSequence {

  /** Construct the sequence. */
  public A229767() {
    super(1, n -> Functions.GPF.z(Z.TWO.pow(2L * n + 1).subtract(Z.TWO.pow(n + 1)).add(1)));
  }
}
