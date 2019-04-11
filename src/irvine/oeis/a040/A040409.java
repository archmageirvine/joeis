package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040409 Continued fraction for <code>sqrt(430)</code>.
 * @author Georg Fischer
 */
public class A040409 extends PrependSequence {

  /** Construct the sequence. */
  public A040409() {
    super(new PeriodicSequence(1, 2, 1, 3, 1, 6, 8, 6, 1, 3, 1, 2, 1, 40), Z.valueOf(20));
  }
}
