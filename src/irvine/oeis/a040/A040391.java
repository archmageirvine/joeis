package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040391 Continued fraction for <code>sqrt(412)</code>.
 * @author Georg Fischer
 */
public class A040391 extends PrependSequence {

  /** Construct the sequence. */
  public A040391() {
    super(new PeriodicSequence(3, 2, 1, 3, 1, 4, 3, 2, 13, 10, 13, 2, 3, 4, 1, 3, 1, 2, 3, 40), Z.valueOf(20));
  }
}
