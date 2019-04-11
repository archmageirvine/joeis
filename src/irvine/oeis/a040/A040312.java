package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040312 Continued fraction for <code>sqrt(331)</code>.
 * @author Georg Fischer
 */
public class A040312 extends PrependSequence {

  /** Construct the sequence. */
  public A040312() {
    super(new PeriodicSequence(5, 5, 1, 6, 2, 3, 1, 1, 2, 1, 2, 1, 11, 2, 1, 1, 17, 1, 1, 2, 11, 1, 2, 1, 2, 1, 1, 3, 2, 6, 1, 5, 5, 36), Z.valueOf(18));
  }
}
