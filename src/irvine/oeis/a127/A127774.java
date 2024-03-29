package irvine.oeis.a127;
// Generated by gen_seq4.pl trixdiag at 2023-06-25 23:10

import irvine.oeis.a000.A000292;
import irvine.oeis.triangle.Diagonal;

/**
 * A127774 Triangle read by rows: row n consists of n-1 zeros followed by A000292(n).
 * @author Georg Fischer
 */
public class A127774 extends Diagonal {

  /** Construct the sequence. */
  public A127774() {
    super(1, new A000292().skip(1));
  }
}
