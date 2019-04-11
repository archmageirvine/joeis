package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040758 Continued fraction for <code>sqrt(787)</code>.
 * @author Georg Fischer
 */
public class A040758 extends PrependSequence {

  /** Construct the sequence. */
  public A040758() {
    super(new PeriodicSequence(18, 1, 2, 5, 1, 8, 1, 1, 27, 1, 1, 8, 1, 5, 2, 1, 18, 56), Z.valueOf(28));
  }
}
