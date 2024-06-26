package irvine.oeis.a334;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.factor.factor.Jaguar;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A334874 a(n) = sigma(1) - tau(2) + sigma(3) - tau(4) + sigma(5) - tau(6) + ... - (up to n).
 * @author Georg Fischer
 */
public class A334874 extends LambdaSequence {

  /** Construct the sequence. */
  public A334874() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Z.NEG_ONE.pow(k + 1).multiply(Jaguar.factor(k).sigma(k % 2))));
  }
}
