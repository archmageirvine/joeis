package irvine.oeis.a125;
// Generated by gen_seq4.pl 2024-05-09/multraf at 2024-05-09 22:36

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A125055 Diagonal of symmetric triangle A125053 located immediately below the central terms (A125054).
 * @author Georg Fischer
 */
public class A125055 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A125055() {
    super(0, (self, n) -> self.s(0).subtract(self.s(1).multiply(2)), "", new A125054().skip(1), new A125054());
  }
}
