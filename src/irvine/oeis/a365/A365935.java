package irvine.oeis.a365;
// Generated by gen_seq4.pl dirtraf at 2023-11-18 23:07

import irvine.oeis.a007.A007778;
import irvine.oeis.a010.A010879;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A365935 Final digit (in decimal system) of n^(n+1) = A007778(n).
 * @author Georg Fischer
 */
public class A365935 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A365935() {
    super(0, new A010879(), new A007778());
  }
}
