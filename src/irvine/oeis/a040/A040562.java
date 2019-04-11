package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040562 Continued fraction for <code>sqrt(587)</code>.
 * @author Georg Fischer
 */
public class A040562 extends PrependSequence {

  /** Construct the sequence. */
  public A040562() {
    super(new PeriodicSequence(4, 2, 1, 1, 1, 1, 23, 1, 1, 1, 1, 2, 4, 48), Z.valueOf(24));
  }
}
