package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040619 Continued fraction for <code>sqrt(645)</code>.
 * @author Georg Fischer
 */
public class A040619 extends PrependSequence {

  /** Construct the sequence. */
  public A040619() {
    super(new PeriodicSequence(2, 1, 1, 12, 10, 12, 1, 1, 2, 50), Z.valueOf(25));
  }
}
