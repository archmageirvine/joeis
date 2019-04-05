package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040967 Continued fraction for sqrt(999).
 * @author Georg Fischer
 */
public class A040967 extends PrependSequence {

  /** Construct the sequence. */
  public A040967() {
    super(new PeriodicSequence(1, 1, 1, 1, 5, 6, 1, 5, 2, 5, 1, 6, 5, 1, 1, 1, 1, 62), Z.valueOf(31));
  }
}
