package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040949 Continued fraction for <code>sqrt(981)</code>.
 * @author Georg Fischer
 */
public class A040949 extends PrependSequence {

  /** Construct the sequence. */
  public A040949() {
    super(new PeriodicSequence(3, 8, 1, 1, 1, 1, 1, 1, 2, 1, 1, 15, 12, 2, 6, 2, 12, 15, 1, 1, 2, 1, 1, 1, 1, 1, 1, 8, 3, 62), Z.valueOf(31));
  }
}
