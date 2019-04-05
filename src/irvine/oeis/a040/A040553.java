package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040553 Continued fraction for sqrt(578).
 * @author Georg Fischer
 */
public class A040553 extends PrependSequence {

  /** Construct the sequence. */
  public A040553() {
    super(new PeriodicSequence(24, 48), Z.valueOf(24));
  }
}
