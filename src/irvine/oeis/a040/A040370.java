package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040370 Continued fraction for <code>sqrt(390)</code>.
 * @author Georg Fischer
 */
public class A040370 extends PrependSequence {

  /** Construct the sequence. */
  public A040370() {
    super(new PeriodicSequence(1, 2, 1, 38), Z.valueOf(19));
  }
}
