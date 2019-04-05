package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040247 Continued fraction for sqrt(264).
 * @author Georg Fischer
 */
public class A040247 extends PrependSequence {

  /** Construct the sequence. */
  public A040247() {
    super(new PeriodicSequence(4, 32), Z.valueOf(16));
  }
}
