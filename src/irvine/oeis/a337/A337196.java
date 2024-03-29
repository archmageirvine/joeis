package irvine.oeis.a337;
// Generated by gen_seq4.pl dirtraf at 2024-02-27 20:59

import irvine.oeis.a007.A007949;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A337196 The 3-adic valuation of 1+A000265(sigma(n)), where A000265 gives the odd part.
 * @author Georg Fischer
 */
public class A337196 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A337196() {
    super(1, new A007949(), new A337194());
  }
}
