package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040886 Continued fraction for <code>sqrt(917)</code>.
 * @author Georg Fischer
 */
public class A040886 extends PrependSequence {

  /** Construct the sequence. */
  public A040886() {
    super(new PeriodicSequence(3, 1, 1, 4, 1, 14, 3, 8, 3, 14, 1, 4, 1, 1, 3, 60), Z.valueOf(30));
  }
}
