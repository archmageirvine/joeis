package irvine.oeis.a245;
// Generated by gen_seq4.pl 2024-03-30/lambdan at 2024-03-30 20:29

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A245832 The Szeged index of the parallelogram-shaped benzenoid Q_k (see Fig. 5.7 of the Diudea et al. reference).
 * @author Georg Fischer
 */
public class A245832 extends LambdaSequence {

  /** Construct the sequence. */
  public A245832() {
    super(1, n -> Z.valueOf(12).multiply(n).add(72).multiply(n).add(137).multiply(n).add(92).multiply(n).add(13).multiply(n).subtract(2).multiply(n).divide(6));
  }
}
