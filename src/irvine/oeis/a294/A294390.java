package irvine.oeis.a294;
// Generated by gen_seq4.pl 2024-10-06.ack/lambdan at 2024-10-06 22:12

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A294390 a(n) = 2^(n-4) mod n, for n &gt;= 4.
 * @author Georg Fischer
 */
public class A294390 extends LambdaSequence {

  /** Construct the sequence. */
  public A294390() {
    super(4, n -> Z.TWO.pow(n - 4).modZ(n));
  }
}
