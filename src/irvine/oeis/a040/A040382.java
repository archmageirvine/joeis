package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040382 Continued fraction for sqrt(403).
 * @author Georg Fischer
 */
public class A040382 extends PrependSequence {

  /** Construct the sequence. */
  public A040382() {
    super(new PeriodicSequence(13, 2, 1, 3, 1, 3, 1, 2, 13, 40), Z.valueOf(20));
  }
}
