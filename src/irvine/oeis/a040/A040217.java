package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040217 Continued fraction for <code>sqrt(233)</code>.
 * @author Georg Fischer
 */
public class A040217 extends PrependSequence {

  /** Construct the sequence. */
  public A040217() {
    super(new PeriodicSequence(3, 1, 3, 1, 1, 1, 1, 3, 1, 3, 30), Z.valueOf(15));
  }
}
