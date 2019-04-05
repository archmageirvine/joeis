package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040208 Continued fraction for sqrt(223).
 * @author Georg Fischer
 */
public class A040208 extends PrependSequence {

  /** Construct the sequence. */
  public A040208() {
    super(new PeriodicSequence(1, 13, 1, 28), Z.valueOf(14));
  }
}
