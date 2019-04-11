package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040596 Continued fraction for <code>sqrt(621)</code>.
 * @author Georg Fischer
 */
public class A040596 extends PrependSequence {

  /** Construct the sequence. */
  public A040596() {
    super(new PeriodicSequence(1, 11, 2, 11, 1, 48), Z.valueOf(24));
  }
}
