package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A065201 Numbers having a non-maximal prime-factor with exponent greater than 1.
 * @author Sean A. Irvine
 */
public class A065201 extends ComplementSequence {

  /** Construct the sequence. */
  public A065201() {
    super(1, new A065200(), Z.ONE);
  }
}
