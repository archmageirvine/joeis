package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A080307 Multiples of the Fermat numbers 2^(2^n)+1.
 * @author Sean A. Irvine
 */
public class A080307 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A080307() {
    super(1, 1, 0, (r, s) -> Z.ONE.shiftLeft(1L << s).add(1).multiply(r));
  }
}

