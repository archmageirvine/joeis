package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040561 Continued fraction for <code>sqrt(586)</code>.
 * @author Georg Fischer
 */
public class A040561 extends PrependSequence {

  /** Construct the sequence. */
  public A040561() {
    super(new PeriodicSequence(4, 1, 4, 1, 1, 2, 1, 2, 7, 1, 2, 2, 1, 7, 2, 1, 2, 1, 1, 4, 1, 4, 48), Z.valueOf(24));
  }
}
