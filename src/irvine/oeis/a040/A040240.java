package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040240 Continued fraction for sqrt(257).
 * @author Georg Fischer
 */
public class A040240 extends PrependSequence {

  /** Construct the sequence. */
  public A040240() {
    super(new PeriodicSequence(32), Z.valueOf(16));
  }
}
