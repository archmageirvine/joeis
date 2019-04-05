package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040846 Continued fraction for sqrt(876).
 * @author Georg Fischer
 */
public class A040846 extends PrependSequence {

  /** Construct the sequence. */
  public A040846() {
    super(new PeriodicSequence(1, 1, 2, 14, 2, 1, 1, 58), Z.valueOf(29));
  }
}
