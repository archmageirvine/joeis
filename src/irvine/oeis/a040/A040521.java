package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040521 Continued fraction for <code>sqrt(545)</code>.
 * @author Georg Fischer
 */
public class A040521 extends PrependSequence {

  /** Construct the sequence. */
  public A040521() {
    super(new PeriodicSequence(2, 1, 8, 1, 2, 46), Z.valueOf(23));
  }
}
