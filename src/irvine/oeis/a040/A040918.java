package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040918 Continued fraction for sqrt(949).
 * @author Georg Fischer
 */
public class A040918 extends PrependSequence {

  /** Construct the sequence. */
  public A040918() {
    super(new PeriodicSequence(1, 4, 6, 1, 1, 1, 4, 2, 14, 1, 19, 1, 1, 1, 1, 19, 1, 14, 2, 4, 1, 1, 1, 6, 4, 1, 60), Z.valueOf(30));
  }
}
