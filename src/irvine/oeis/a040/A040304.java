package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040304 Continued fraction for sqrt(322).
 * @author Georg Fischer
 */
public class A040304 extends PrependSequence {

  /** Construct the sequence. */
  public A040304() {
    super(new PeriodicSequence(1, 16, 1, 34), Z.valueOf(17));
  }
}
