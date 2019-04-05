package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040867 Continued fraction for sqrt(897).
 * @author Georg Fischer
 */
public class A040867 extends PrependSequence {

  /** Construct the sequence. */
  public A040867() {
    super(new PeriodicSequence(1, 18, 1, 58), Z.valueOf(29));
  }
}
