package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040647 Continued fraction for <code>sqrt(673)</code>.
 * @author Georg Fischer
 */
public class A040647 extends PrependSequence {

  /** Construct the sequence. */
  public A040647() {
    super(new PeriodicSequence(1, 16, 3, 5, 2, 3, 1, 1, 6, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 6, 1, 1, 3, 2, 5, 3, 16, 1, 50), Z.valueOf(25));
  }
}
