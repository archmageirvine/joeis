package irvine.oeis.a146;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.a000.A000712;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A146023 Triangle read by rows, square of A027293.
 * @author Georg Fischer
 */
public class A146023 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A146023() {
    super(0, new A000712());
  }
}

