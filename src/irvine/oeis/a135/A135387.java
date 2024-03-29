package irvine.oeis.a135;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A135387 Triangle read by rows, with (2, 1, 0, 0, 0, ...) in every column.
 * @author Georg Fischer
 */
public class A135387 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A135387() {
    super(1, new PaddingSequence("2,1", "0"));
  }
}

