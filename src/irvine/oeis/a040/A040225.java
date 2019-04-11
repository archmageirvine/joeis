package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040225 Continued fraction for <code>sqrt(241)</code>.
 * @author Georg Fischer
 */
public class A040225 extends PrependSequence {

  /** Construct the sequence. */
  public A040225() {
    super(new PeriodicSequence(1, 1, 9, 1, 5, 3, 3, 1, 1, 3, 3, 5, 1, 9, 1, 1, 30), Z.valueOf(15));
  }
}
