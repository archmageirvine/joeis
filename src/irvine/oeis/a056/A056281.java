package irvine.oeis.a056;
// Generated by gen_seq4.pl triselect

import irvine.oeis.a137.A137651;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A056281 Number of primitive (aperiodic) word structures of length n which contain exactly five different symbols.
 * @author Georg Fischer
 */
public class A056281 extends TriangleSelector {

  /** Construct the sequence. */
  public A056281() {
    super(1, new A137651(), 1, n -> new int[] {n, 5});
  }
}
