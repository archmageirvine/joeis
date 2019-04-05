package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040193 Continued fraction for sqrt(208).
 * @author Georg Fischer
 */
public class A040193 extends PrependSequence {

  /** Construct the sequence. */
  public A040193() {
    super(new PeriodicSequence(2, 2, 1, 2, 2, 28), Z.valueOf(14));
  }
}
