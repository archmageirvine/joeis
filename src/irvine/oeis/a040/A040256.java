package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040256 Continued fraction for <code>sqrt(273)</code>.
 * @author Georg Fischer
 */
public class A040256 extends PrependSequence {

  /** Construct the sequence. */
  public A040256() {
    super(new PeriodicSequence(1, 1, 10, 1, 1, 32), Z.valueOf(16));
  }
}
