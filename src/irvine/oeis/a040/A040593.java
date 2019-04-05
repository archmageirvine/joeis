package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040593 Continued fraction for sqrt(618).
 * @author Georg Fischer
 */
public class A040593 extends PrependSequence {

  /** Construct the sequence. */
  public A040593() {
    super(new PeriodicSequence(1, 6, 8, 6, 1, 48), Z.valueOf(24));
  }
}
