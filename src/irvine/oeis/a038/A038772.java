package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A038772 Numbers not divisible by any of their digits.
 * @author Sean A. Irvine
 */
public class A038772 extends ComplementSequence {

  /** Construct the sequence. */
  public A038772() {
    super(new A038770(), Z.ONE);
  }
}
