package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040351 Continued fraction for sqrt(371).
 * @author Georg Fischer
 */
public class A040351 extends PrependSequence {

  /** Construct the sequence. */
  public A040351() {
    super(new PeriodicSequence(3, 1, 4, 1, 3, 38), Z.valueOf(19));
  }
}
