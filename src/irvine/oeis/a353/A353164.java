package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-04-25/multrar at 2024-04-25 23:20

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A353164 Expansion of 1/(1 - Sum_{p prime} p * x^p).
 * @author Georg Fischer
 */
public class A353164 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A353164() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> (Z.valueOf(k).isProbablePrime() ? Z.ONE : Z.ZERO).multiply(self.a(n - k)).multiply(k)), "1");
  }
}
