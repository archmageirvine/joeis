package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040571 Continued fraction for <code>sqrt(596)</code>.
 * @author Georg Fischer
 */
public class A040571 extends PrependSequence {

  /** Construct the sequence. */
  public A040571() {
    super(new PeriodicSequence(2, 2, 2, 1, 1, 1, 6, 2, 1, 9, 12, 9, 1, 2, 6, 1, 1, 1, 2, 2, 2, 48), Z.valueOf(24));
  }
}
