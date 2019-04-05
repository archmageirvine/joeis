package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040587 Continued fraction for sqrt(612).
 * @author Georg Fischer
 */
public class A040587 extends PrependSequence {

  /** Construct the sequence. */
  public A040587() {
    super(new PeriodicSequence(1, 2, 1, 4, 1, 2, 1, 48), Z.valueOf(24));
  }
}
