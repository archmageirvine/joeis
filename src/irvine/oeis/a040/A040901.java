package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040901 Continued fraction for <code>sqrt(932)</code>.
 * @author Georg Fischer
 */
public class A040901 extends PrependSequence {

  /** Construct the sequence. */
  public A040901() {
    super(new PeriodicSequence(1, 1, 8, 4, 1, 1, 2, 1, 1, 1, 14, 1, 1, 1, 2, 1, 1, 4, 8, 1, 1, 60), Z.valueOf(30));
  }
}
