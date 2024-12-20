package irvine.oeis.a225;
// Generated by gen_seq4.pl 2024-12-15.ack/lambdan at 2024-12-15 23:09

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A225751 Number of different figures obtained by a putting two Young diagrams of partitions lambda and mu, such that |lambda| + |mu| = n on top of each other.
 * @author Georg Fischer
 */
public class A225751 extends LambdaSequence {

  /** Construct the sequence. */
  public A225751() {
    super(0, n -> Integers.SINGLETON.sum(((n & 1) == 0) ? n / 2 : n / 2 + 1, n, k -> Functions.PARTITIONS.z(k)));
  }
}
