package irvine.oeis.a055;
// Generated by gen_seq4.pl A055115/arrselect

import irvine.oeis.a248.A248813;
import irvine.oeis.triangle.ArraySelector;

/**
 * A055117 Base-7 complement of n (write n in base 7, then replace each digit with its base-7 negative).
 * @author Georg Fischer
 */
public class A055117 extends ArraySelector {

  /** Construct the sequence. */
  public A055117() {
    super(0, new A248813(), 0, 2, n -> new int[] {n, 7});
  }
}

