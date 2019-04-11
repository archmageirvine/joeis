package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040956 Continued fraction for <code>sqrt(988)</code>.
 * @author Georg Fischer
 */
public class A040956 extends PrependSequence {

  /** Construct the sequence. */
  public A040956() {
    super(new PeriodicSequence(2, 3, 4, 1, 20, 6, 1, 14, 1, 6, 20, 1, 4, 3, 2, 62), Z.valueOf(31));
  }
}
