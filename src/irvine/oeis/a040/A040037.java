package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040037 Continued fraction for sqrt(44).
 * @author Georg Fischer
 */
public class A040037 extends PrependSequence {

  /** Construct the sequence. */
  public A040037() {
    super(new PeriodicSequence(1, 1, 1, 2, 1, 1, 1, 12), Z.valueOf(6));
  }
}
