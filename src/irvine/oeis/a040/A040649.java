package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040649 Continued fraction for <code>sqrt(675)</code>.
 * @author Georg Fischer
 */
public class A040649 extends PrependSequence {

  /** Construct the sequence. */
  public A040649() {
    super(new PeriodicSequence(1, 50), Z.valueOf(25));
  }
}
