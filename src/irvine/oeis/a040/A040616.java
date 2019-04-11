package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040616 Continued fraction for <code>sqrt(642)</code>.
 * @author Georg Fischer
 */
public class A040616 extends PrependSequence {

  /** Construct the sequence. */
  public A040616() {
    super(new PeriodicSequence(2, 1, 24, 1, 2, 50), Z.valueOf(25));
  }
}
