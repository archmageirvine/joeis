package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040271 Continued fraction for sqrt(288).
 * @author Georg Fischer
 */
public class A040271 extends PrependSequence {

  /** Construct the sequence. */
  public A040271() {
    super(new PeriodicSequence(1, 32), Z.valueOf(16));
  }
}
