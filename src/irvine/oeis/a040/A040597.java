package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040597 Continued fraction for <code>sqrt(622)</code>.
 * @author Georg Fischer
 */
public class A040597 extends PrependSequence {

  /** Construct the sequence. */
  public A040597() {
    super(new PeriodicSequence(1, 15, 1, 1, 1, 4, 1, 7, 2, 24, 2, 7, 1, 4, 1, 1, 1, 15, 1, 48), Z.valueOf(24));
  }
}
