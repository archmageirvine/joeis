package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040915 Continued fraction for sqrt(946).
 * @author Georg Fischer
 */
public class A040915 extends PrependSequence {

  /** Construct the sequence. */
  public A040915() {
    super(new PeriodicSequence(1, 3, 8, 1, 1, 6, 3, 3, 1, 3, 1, 1, 1, 2, 30, 2, 1, 1, 1, 3, 1, 3, 3, 6, 1, 1, 8, 3, 1, 60), Z.valueOf(30));
  }
}
