package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040340 Continued fraction for <code>sqrt(359)</code>.
 * @author Georg Fischer
 */
public class A040340 extends PrependSequence {

  /** Construct the sequence. */
  public A040340() {
    super(new PeriodicSequence(1, 17, 1, 36), Z.valueOf(18));
  }
}
