package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040957 Continued fraction for <code>sqrt(989)</code>.
 * @author Georg Fischer
 */
public class A040957 extends PrependSequence {

  /** Construct the sequence. */
  public A040957() {
    super(new PeriodicSequence(2, 4, 2, 1, 11, 1, 8, 15, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 15, 8, 1, 11, 1, 2, 4, 2, 62), Z.valueOf(31));
  }
}
