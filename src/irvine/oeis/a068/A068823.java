package irvine.oeis.a068;
// Generated by gen_seq4.pl 2023-11-30/lambdan at 2023-12-03 21:34

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a178.A178914;

/**
 * A068823 a(n) = lcm(n, c(n)), where c(n) is the 10's complement of n.
 * @author Georg Fischer
 */
public class A068823 extends LambdaSequence {

  /** Construct the sequence. */
  public A068823() {
    super(1, n -> Z.valueOf(n).lcm(new A178914().a(n)));
  }
}
