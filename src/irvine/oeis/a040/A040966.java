package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040966 Continued fraction for sqrt(998).
 * @author Georg Fischer
 */
public class A040966 extends PrependSequence {

  /** Construct the sequence. */
  public A040966() {
    super(new PeriodicSequence(1, 1, 2, 4, 8, 1, 3, 1, 30, 1, 3, 1, 8, 4, 2, 1, 1, 62), Z.valueOf(31));
  }
}
