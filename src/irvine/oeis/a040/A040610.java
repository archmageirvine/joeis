package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040610 Continued fraction for <code>sqrt(636)</code>.
 * @author Georg Fischer
 */
public class A040610 extends PrependSequence {

  /** Construct the sequence. */
  public A040610() {
    super(new PeriodicSequence(4, 1, 1, 3, 3, 12, 3, 3, 1, 1, 4, 50), Z.valueOf(25));
  }
}
