package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040932 Continued fraction for <code>sqrt(964)</code>.
 * @author Georg Fischer
 */
public class A040932 extends PrependSequence {

  /** Construct the sequence. */
  public A040932() {
    super(new PeriodicSequence(20, 1, 2, 6, 1, 1, 3, 1, 1, 1, 1, 11, 1, 4, 3, 1, 14, 1, 3, 4, 1, 11, 1, 1, 1, 1, 3, 1, 1, 6, 2, 1, 20, 62), Z.valueOf(31));
  }
}
