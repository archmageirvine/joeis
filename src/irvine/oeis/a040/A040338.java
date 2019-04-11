package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040338 Continued fraction for <code>sqrt(357)</code>.
 * @author Georg Fischer
 */
public class A040338 extends PrependSequence {

  /** Construct the sequence. */
  public A040338() {
    super(new PeriodicSequence(1, 8, 2, 8, 1, 36), Z.valueOf(18));
  }
}
