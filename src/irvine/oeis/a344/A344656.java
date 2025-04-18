package irvine.oeis.a344;
// Generated by gen_seq4.pl 2024-11-22.ack/lambdan at 2024-11-22 22:47

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a006.A006880;

/**
 * A344656 Number of odd composites &lt;= 10^n.
 * @author Georg Fischer
 */
public class A344656 extends LambdaSequence {

  private static final DirectSequence A006880 = new A006880();

  /** Construct the sequence. */
  public A344656() {
    super(1, n -> Z.TEN.pow(n).divide(2).subtract(A006880.a(n)));
  }
}
