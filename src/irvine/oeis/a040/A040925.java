package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040925 Continued fraction for <code>sqrt(956)</code>.
 * @author Georg Fischer
 */
public class A040925 extends PrependSequence {

  /** Construct the sequence. */
  public A040925() {
    super(new PeriodicSequence(1, 11, 2, 1, 1, 1, 1, 7, 8, 1, 2, 2, 1, 2, 1, 14, 1, 2, 1, 2, 2, 1, 8, 7, 1, 1, 1, 1, 2, 11, 1, 60), Z.valueOf(30));
  }
}
