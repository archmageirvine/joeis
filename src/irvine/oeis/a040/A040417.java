package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040417 Continued fraction for sqrt(438).
 * @author Georg Fischer
 */
public class A040417 extends PrependSequence {

  /** Construct the sequence. */
  public A040417() {
    super(new PeriodicSequence(1, 12, 1, 40), Z.valueOf(20));
  }
}
