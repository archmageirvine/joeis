package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040356 Continued fraction for sqrt(376).
 * @author Georg Fischer
 */
public class A040356 extends PrependSequence {

  /** Construct the sequence. */
  public A040356() {
    super(new PeriodicSequence(2, 1, 1, 3, 1, 2, 2, 4, 2, 2, 1, 3, 1, 1, 2, 38), Z.valueOf(19));
  }
}
