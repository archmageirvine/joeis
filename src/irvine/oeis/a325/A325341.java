package irvine.oeis.a325;
// Generated by gen_seq4.pl 2025-02-03.ack/multraf at 2025-02-03 18:14

import irvine.math.function.Functions;
import irvine.oeis.a003.A003106;
import irvine.oeis.a064.A064174;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A325341 Number of partitions p of n such that min(p) &lt;= (number of parts of p) &lt; max(p).
 * @author Georg Fischer
 */
public class A325341 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A325341() {
    super(1, (self, n) -> Functions.PARTITIONS.z(n).subtract(self.s(0)).subtract(self.s(1)), "", new A003106(), new A064174());
  }
}
