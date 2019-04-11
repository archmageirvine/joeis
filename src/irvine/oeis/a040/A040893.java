package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040893 Continued fraction for <code>sqrt(924)</code>.
 * @author Georg Fischer
 */
public class A040893 extends PrependSequence {

  /** Construct the sequence. */
  public A040893() {
    super(new PeriodicSequence(2, 1, 1, 14, 1, 1, 2, 60), Z.valueOf(30));
  }
}
