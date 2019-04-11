package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040895 Continued fraction for <code>sqrt(926)</code>.
 * @author Georg Fischer
 */
public class A040895 extends PrependSequence {

  /** Construct the sequence. */
  public A040895() {
    super(new PeriodicSequence(2, 3, 11, 1, 7, 1, 3, 2, 5, 1, 1, 1, 4, 30, 4, 1, 1, 1, 5, 2, 3, 1, 7, 1, 11, 3, 2, 60), Z.valueOf(30));
  }
}
