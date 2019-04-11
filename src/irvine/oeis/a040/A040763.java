package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040763 Continued fraction for <code>sqrt(792)</code>.
 * @author Georg Fischer
 */
public class A040763 extends PrependSequence {

  /** Construct the sequence. */
  public A040763() {
    super(new PeriodicSequence(7, 56), Z.valueOf(28));
  }
}
