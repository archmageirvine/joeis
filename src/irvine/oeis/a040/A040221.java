package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040221 Continued fraction for <code>sqrt(237)</code>.
 * @author Georg Fischer
 */
public class A040221 extends PrependSequence {

  /** Construct the sequence. */
  public A040221() {
    super(new PeriodicSequence(2, 1, 1, 7, 10, 7, 1, 1, 2, 30), Z.valueOf(15));
  }
}
