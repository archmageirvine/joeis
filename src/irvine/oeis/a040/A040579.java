package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040579 Continued fraction for sqrt(604).
 * @author Georg Fischer
 */
public class A040579 extends PrependSequence {

  /** Construct the sequence. */
  public A040579() {
    super(new PeriodicSequence(1, 1, 2, 1, 3, 2, 1, 1, 1, 1, 1, 4, 1, 5, 3, 9, 1, 1, 15, 1, 6, 12, 6, 1, 15, 1, 1, 9, 3, 5, 1, 4, 1, 1, 1, 1, 1, 2, 3, 1, 2, 1, 1, 48), Z.valueOf(24));
  }
}
