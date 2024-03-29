package irvine.oeis.a174;
// Generated by gen_seq4.pl trixdiag at 2023-06-25 23:10

import irvine.oeis.a000.A000041;
import irvine.oeis.triangle.Diagonal;

/**
 * A174712 Triangle T(n,k) read by rows in which the right border is A000041, else zero, n &gt;= 0.
 * @author Georg Fischer
 */
public class A174712 extends Diagonal {

  /** Construct the sequence. */
  public A174712() {
    super(0, new A000041());
  }
}
