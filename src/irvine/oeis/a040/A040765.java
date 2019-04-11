package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040765 Continued fraction for <code>sqrt(794)</code>.
 * @author Georg Fischer
 */
public class A040765 extends PrependSequence {

  /** Construct the sequence. */
  public A040765() {
    super(new PeriodicSequence(5, 1, 1, 1, 1, 1, 1, 1, 1, 5, 56), Z.valueOf(28));
  }
}
