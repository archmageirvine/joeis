package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040335 Continued fraction for <code>sqrt(354)</code>.
 * @author Georg Fischer
 */
public class A040335 extends PrependSequence {

  /** Construct the sequence. */
  public A040335() {
    super(new PeriodicSequence(1, 4, 2, 2, 18, 2, 2, 4, 1, 36), Z.valueOf(18));
  }
}
