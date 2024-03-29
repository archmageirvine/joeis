package irvine.oeis.a055;
// Generated by gen_seq4.pl A055115/arrselect

import irvine.oeis.a248.A248813;
import irvine.oeis.triangle.ArraySelector;

/**
 * A055126 Base-16 complement of n (write n in base 16, then replace each digit with its base-16 negative).
 * @author Georg Fischer
 */
public class A055126 extends ArraySelector {

  /** Construct the sequence. */
  public A055126() {
    super(0, new A248813(), 0, 2, n -> new int[] {n, 16});
  }
}

