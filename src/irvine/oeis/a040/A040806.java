package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040806 Continued fraction for <code>sqrt(835)</code>.
 * @author Georg Fischer
 */
public class A040806 extends PrependSequence {

  /** Construct the sequence. */
  public A040806() {
    super(new PeriodicSequence(1, 8, 1, 1, 1, 5, 1, 3, 3, 1, 1, 2, 5, 2, 1, 1, 3, 3, 1, 5, 1, 1, 1, 8, 1, 56), Z.valueOf(28));
  }
}
