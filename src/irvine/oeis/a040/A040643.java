package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040643 Continued fraction for <code>sqrt(669)</code>.
 * @author Georg Fischer
 */
public class A040643 extends PrependSequence {

  /** Construct the sequence. */
  public A040643() {
    super(new PeriodicSequence(1, 6, 2, 2, 3, 1, 9, 1, 1, 2, 1, 12, 4, 1, 1, 1, 1, 1, 16, 1, 1, 1, 1, 1, 4, 12, 1, 2, 1, 1, 9, 1, 3, 2, 2, 6, 1, 50), Z.valueOf(25));
  }
}
