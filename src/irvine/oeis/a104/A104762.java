package irvine.oeis.a104;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.a000.A000045;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A104762 Triangle read by rows: row n contains first n nonzero Fibonacci numbers in decreasing order.
 * @author Georg Fischer
 */
public class A104762 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A104762() {
    super(1, new A000045().skip(1));
  }
}

