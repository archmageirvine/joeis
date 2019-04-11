package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040906 Continued fraction for <code>sqrt(937)</code>.
 * @author Georg Fischer
 */
public class A040906 extends PrependSequence {

  /** Construct the sequence. */
  public A040906() {
    super(new PeriodicSequence(1, 1, 1, 1, 3, 4, 2, 3, 6, 1, 1, 19, 1, 6, 1, 2, 2, 1, 6, 1, 19, 1, 1, 6, 3, 2, 4, 3, 1, 1, 1, 1, 60), Z.valueOf(30));
  }
}
