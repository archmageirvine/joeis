package irvine.oeis.a106;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.a000.A000010;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A106476 Sequence array of Euler phi function.
 * @author Georg Fischer
 */
public class A106476 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A106476() {
    super(0, new A000010());
  }
}

