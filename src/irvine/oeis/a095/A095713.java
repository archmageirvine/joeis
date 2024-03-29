package irvine.oeis.a095;
// Generated by gen_seq4.pl tritoep

import irvine.oeis.a001.A001622;
import irvine.oeis.triangle.ToeplitzTriangle;

/**
 * A095713 Triangle of numbers obtained by reversing the first n digits of golden ratio phi and juxtaposing.
 * @author Georg Fischer
 */
public class A095713 extends ToeplitzTriangle {

  /** Construct the sequence. */
  public A095713() {
    super(1, new A001622());
  }
}

