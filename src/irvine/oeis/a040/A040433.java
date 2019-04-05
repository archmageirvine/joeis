package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040433 Continued fraction for sqrt(455).
 * @author Georg Fischer
 */
public class A040433 extends PrependSequence {

  /** Construct the sequence. */
  public A040433() {
    super(new PeriodicSequence(3, 42), Z.valueOf(21));
  }
}
