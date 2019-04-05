package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040272 Continued fraction for sqrt(290).
 * @author Georg Fischer
 */
public class A040272 extends PrependSequence {

  /** Construct the sequence. */
  public A040272() {
    super(new PeriodicSequence(34), Z.valueOf(17));
  }
}
