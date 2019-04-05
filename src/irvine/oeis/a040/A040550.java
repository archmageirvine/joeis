package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040550 Continued fraction for sqrt(574).
 * @author Georg Fischer
 */
public class A040550 extends PrependSequence {

  /** Construct the sequence. */
  public A040550() {
    super(new PeriodicSequence(1, 22, 1, 46), Z.valueOf(23));
  }
}
