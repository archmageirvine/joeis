package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040939 Continued fraction for <code>sqrt(971)</code>.
 * @author Georg Fischer
 */
public class A040939 extends PrependSequence {

  /** Construct the sequence. */
  public A040939() {
    super(new PeriodicSequence(6, 4, 1, 1, 1, 2, 5, 3, 2, 12, 31, 12, 2, 3, 5, 2, 1, 1, 1, 4, 6, 62), Z.valueOf(31));
  }
}
