package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040796 Continued fraction for <code>sqrt(825)</code>.
 * @author Georg Fischer
 */
public class A040796 extends PrependSequence {

  /** Construct the sequence. */
  public A040796() {
    super(new PeriodicSequence(1, 2, 1, 1, 1, 1, 4, 1, 1, 1, 1, 2, 1, 56), Z.valueOf(28));
  }
}
