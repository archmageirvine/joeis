package irvine.oeis.a294;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A294098 Number of partitions of 2n into two parts such that one part is squarefree and the other part is nonsquarefree.
 * @author Georg Fischer
 */
public class A294098 extends LambdaSequence {

  /** Construct the sequence. */
  public A294098() {
    super(1, n -> Integers.SINGLETON.sum(1, n, i -> Functions.MOEBIUS.z(i).square().multiply(Z.ONE.subtract(Functions.MOEBIUS.z(2 * n - i).square())).add(Z.ONE.subtract(Functions.MOEBIUS.z(i).square()).multiply(Functions.MOEBIUS.z(2 * n - i).square()))));
  }
}
