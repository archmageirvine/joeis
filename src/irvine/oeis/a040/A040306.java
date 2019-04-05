package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040306 Continued fraction for sqrt(325).
 * @author Georg Fischer
 */
public class A040306 extends PrependSequence {

  /** Construct the sequence. */
  public A040306() {
    super(new PeriodicSequence(36), Z.valueOf(18));
  }
}
