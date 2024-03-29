package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-03-26/dirtraf at 2024-03-26 23:22

import irvine.oeis.a007.A007954;
import irvine.oeis.a010.A010879;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A371281 Last digit of the product of decimal digits of n.
 * @author Georg Fischer
 */
public class A371281 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A371281() {
    super(0, new A010879(), new A007954());
  }
}
