package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040923 Continued fraction for <code>sqrt(954)</code>.
 * @author Georg Fischer
 */
public class A040923 extends PrependSequence {

  /** Construct the sequence. */
  public A040923() {
    super(new PeriodicSequence(1, 7, 1, 5, 3, 2, 6, 2, 3, 5, 1, 7, 1, 60), Z.valueOf(30));
  }
}
