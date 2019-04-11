package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040414 Continued fraction for <code>sqrt(435)</code>.
 * @author Georg Fischer
 */
public class A040414 extends PrependSequence {

  /** Construct the sequence. */
  public A040414() {
    super(new PeriodicSequence(1, 5, 1, 40), Z.valueOf(20));
  }
}
