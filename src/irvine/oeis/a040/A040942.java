package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040942 Continued fraction for <code>sqrt(974)</code>.
 * @author Georg Fischer
 */
public class A040942 extends PrependSequence {

  /** Construct the sequence. */
  public A040942() {
    super(new PeriodicSequence(4, 1, 3, 1, 1, 1, 11, 1, 5, 3, 8, 1, 1, 1, 1, 30, 1, 1, 1, 1, 8, 3, 5, 1, 11, 1, 1, 1, 3, 1, 4, 62), Z.valueOf(31));
  }
}
