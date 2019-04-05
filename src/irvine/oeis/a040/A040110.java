package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040110 Continued fraction for sqrt(122).
 * @author Georg Fischer
 */
public class A040110 extends PrependSequence {

  /** Construct the sequence. */
  public A040110() {
    super(new PeriodicSequence(22), Z.valueOf(11));
  }
}
