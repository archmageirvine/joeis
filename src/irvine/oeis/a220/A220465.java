package irvine.oeis.a220;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.a004.A004736;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A220465 Reverse reluctant sequence of reverse reluctant sequence A004736.
 * @author Georg Fischer
 */
public class A220465 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A220465() {
    super(1, new A004736());
  }
}

