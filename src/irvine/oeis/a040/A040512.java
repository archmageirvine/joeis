package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040512 Continued fraction for sqrt(536).
 * @author Georg Fischer
 */
public class A040512 extends PrependSequence {

  /** Construct the sequence. */
  public A040512() {
    super(new PeriodicSequence(6, 1, 1, 2, 5, 2, 1, 1, 6, 46), Z.valueOf(23));
  }
}
