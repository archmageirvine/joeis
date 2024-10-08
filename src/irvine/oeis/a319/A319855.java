package irvine.oeis.a319;
// Generated by gen_seq4.pl 2024-09-12.ack/lambdan at 2024-09-12 20:55

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a007.A007814;
import irvine.oeis.a056.A056239;

/**
 * A319855 Minimum number that can be obtained by iteratively adding or multiplying together parts of the integer partition with Heinz number n until only one part remains.
 * @author Georg Fischer
 */
public class A319855 extends LambdaSequence {

  private static final DirectSequence A007814 = new A007814();
  private static final DirectSequence A056239 = new A056239();

  /** Construct the sequence. */
  public A319855() {
    super(1, n -> (n == 1) ? Z.ZERO : Functions.MAX.z(A056239.a(n).subtract(A007814.a(n)), Z.ONE));
  }
}
