package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040692 Continued fraction for sqrt(719).
 * @author Georg Fischer
 */
public class A040692 extends PrependSequence {

  /** Construct the sequence. */
  public A040692() {
    super(new PeriodicSequence(1, 4, 2, 1, 1, 1, 1, 1, 4, 3, 1, 9, 1, 25, 1, 9, 1, 3, 4, 1, 1, 1, 1, 1, 2, 4, 1, 52), Z.valueOf(26));
  }
}
