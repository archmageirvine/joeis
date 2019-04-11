package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040564 Continued fraction for <code>sqrt(589)</code>.
 * @author Georg Fischer
 */
public class A040564 extends PrependSequence {

  /** Construct the sequence. */
  public A040564() {
    super(new PeriodicSequence(3, 1, 2, 2, 15, 1, 3, 9, 2, 4, 1, 11, 3, 6, 1, 1, 1, 1, 3, 2, 3, 1, 1, 1, 1, 6, 3, 11, 1, 4, 2, 9, 3, 1, 15, 2, 2, 1, 3, 48), Z.valueOf(24));
  }
}
