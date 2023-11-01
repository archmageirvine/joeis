package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a055.A055394;

/**
 * A066650 Numbers not of the form a^2 + b^3 with a, b &gt; 0.
 * @author Sean A. Irvine
 */
public class A066650 extends ComplementSequence {

  /** Construct the sequence. */
  public A066650() {
    super(new A055394(), Z.ONE);
  }
}
