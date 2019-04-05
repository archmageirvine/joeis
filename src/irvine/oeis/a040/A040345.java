package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040345 Continued fraction for sqrt(365).
 * @author Georg Fischer
 */
public class A040345 extends PrependSequence {

  /** Construct the sequence. */
  public A040345() {
    super(new PeriodicSequence(9, 1, 1, 9, 38), Z.valueOf(19));
  }
}
