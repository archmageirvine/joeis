package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040476 Continued fraction for sqrt(499).
 * @author Georg Fischer
 */
public class A040476 extends PrependSequence {

  /** Construct the sequence. */
  public A040476() {
    super(new PeriodicSequence(2, 1, 21, 1, 2, 44), Z.valueOf(22));
  }
}
