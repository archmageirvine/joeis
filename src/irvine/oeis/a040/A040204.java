package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040204 Continued fraction for <code>sqrt(219)</code>.
 * @author Georg Fischer
 */
public class A040204 extends PrependSequence {

  /** Construct the sequence. */
  public A040204() {
    super(new PeriodicSequence(1, 3, 1, 28), Z.valueOf(14));
  }
}
