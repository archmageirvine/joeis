package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040809 Continued fraction for <code>sqrt(838)</code>.
 * @author Georg Fischer
 */
public class A040809 extends PrependSequence {

  /** Construct the sequence. */
  public A040809() {
    super(new PeriodicSequence(1, 18, 3, 6, 9, 2, 28, 2, 9, 6, 3, 18, 1, 56), Z.valueOf(28));
  }
}
