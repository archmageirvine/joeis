package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040275 Continued fraction for sqrt(293).
 * @author Georg Fischer
 */
public class A040275 extends PrependSequence {

  /** Construct the sequence. */
  public A040275() {
    super(new PeriodicSequence(8, 1, 1, 8, 34), Z.valueOf(17));
  }
}
