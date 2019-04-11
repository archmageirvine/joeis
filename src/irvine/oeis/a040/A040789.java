package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040789 Continued fraction for <code>sqrt(818)</code>.
 * @author Georg Fischer
 */
public class A040789 extends PrependSequence {

  /** Construct the sequence. */
  public A040789() {
    super(new PeriodicSequence(1, 1, 1, 1, 56), Z.valueOf(28));
  }
}
