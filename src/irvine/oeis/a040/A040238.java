package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040238 Continued fraction for sqrt(254).
 * @author Georg Fischer
 */
public class A040238 extends PrependSequence {

  /** Construct the sequence. */
  public A040238() {
    super(new PeriodicSequence(1, 14, 1, 30), Z.valueOf(15));
  }
}
