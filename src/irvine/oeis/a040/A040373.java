package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040373 Continued fraction for sqrt(393).
 * @author Georg Fischer
 */
public class A040373 extends PrependSequence {

  /** Construct the sequence. */
  public A040373() {
    super(new PeriodicSequence(1, 4, 1, 2, 4, 1, 1, 1, 1, 12, 1, 1, 1, 1, 4, 2, 1, 4, 1, 38), Z.valueOf(19));
  }
}
