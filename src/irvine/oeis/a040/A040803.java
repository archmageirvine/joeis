package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040803 Continued fraction for <code>sqrt(832)</code>.
 * @author Georg Fischer
 */
public class A040803 extends PrependSequence {

  /** Construct the sequence. */
  public A040803() {
    super(new PeriodicSequence(1, 5, 2, 2, 1, 13, 1, 2, 2, 5, 1, 56), Z.valueOf(28));
  }
}
