package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040874 Continued fraction for sqrt(905).
 * @author Georg Fischer
 */
public class A040874 extends PrependSequence {

  /** Construct the sequence. */
  public A040874() {
    super(new PeriodicSequence(12, 60), Z.valueOf(30));
  }
}
