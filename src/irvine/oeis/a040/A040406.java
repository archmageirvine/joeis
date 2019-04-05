package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040406 Continued fraction for sqrt(427).
 * @author Georg Fischer
 */
public class A040406 extends PrependSequence {

  /** Construct the sequence. */
  public A040406() {
    super(new PeriodicSequence(1, 1, 1, 40), Z.valueOf(20));
  }
}
