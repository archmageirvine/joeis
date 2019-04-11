package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040750 Continued fraction for <code>sqrt(778)</code>.
 * @author Georg Fischer
 */
public class A040750 extends PrependSequence {

  /** Construct the sequence. */
  public A040750() {
    super(new PeriodicSequence(1, 8, 3, 5, 1, 7, 7, 1, 5, 3, 8, 1, 54), Z.valueOf(27));
  }
}
