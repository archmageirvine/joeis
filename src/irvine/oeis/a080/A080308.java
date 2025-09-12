package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A080308 Non-multiples of Fermat numbers 2^(2^n)+1.
 * @author Sean A. Irvine
 */
public class A080308 extends ComplementSequence {

  /** Construct the sequence. */
  public A080308() {
    super(1, Z.ONE, new A080307());
  }
}

