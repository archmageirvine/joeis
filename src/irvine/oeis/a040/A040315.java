package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040315 Continued fraction for sqrt(334).
 * @author Georg Fischer
 */
public class A040315 extends PrependSequence {

  /** Construct the sequence. */
  public A040315() {
    super(new PeriodicSequence(3, 1, 1, 1, 2, 5, 1, 2, 2, 11, 1, 3, 7, 18, 7, 3, 1, 11, 2, 2, 1, 5, 2, 1, 1, 1, 3, 36), Z.valueOf(18));
  }
}
