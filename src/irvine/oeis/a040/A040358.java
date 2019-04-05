package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040358 Continued fraction for sqrt(378).
 * @author Georg Fischer
 */
public class A040358 extends PrependSequence {

  /** Construct the sequence. */
  public A040358() {
    super(new PeriodicSequence(2, 3, 1, 4, 1, 3, 2, 38), Z.valueOf(19));
  }
}
