package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040607 Continued fraction for <code>sqrt(633)</code>.
 * @author Georg Fischer
 */
public class A040607 extends PrependSequence {

  /** Construct the sequence. */
  public A040607() {
    super(new PeriodicSequence(6, 3, 1, 2, 2, 1, 1, 2, 16, 2, 1, 1, 2, 2, 1, 3, 6, 50), Z.valueOf(25));
  }
}
