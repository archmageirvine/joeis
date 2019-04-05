package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040627 Continued fraction for sqrt(653).
 * @author Georg Fischer
 */
public class A040627 extends PrependSequence {

  /** Construct the sequence. */
  public A040627() {
    super(new PeriodicSequence(1, 1, 4, 7, 12, 1, 1, 1, 3, 3, 1, 1, 1, 12, 7, 4, 1, 1, 50), Z.valueOf(25));
  }
}
