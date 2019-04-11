package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040491 Continued fraction for <code>sqrt(514)</code>.
 * @author Georg Fischer
 */
public class A040491 extends PrependSequence {

  /** Construct the sequence. */
  public A040491() {
    super(new PeriodicSequence(1, 2, 22, 2, 1, 44), Z.valueOf(22));
  }
}
