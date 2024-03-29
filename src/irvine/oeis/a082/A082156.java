package irvine.oeis.a082;
// Generated by gen_seq4.pl trimirr/trimirror at 2023-08-07 19:48

import irvine.oeis.a056.A056537;
import irvine.oeis.triangle.Transpose;

/**
 * A082156 Dispersion of the complement of row 1 of A056536.
 * @author Georg Fischer
 */
public class A082156 extends Transpose {

  /** Construct the sequence. */
  public A082156() {
    super(1, new A056537());
  }
}
