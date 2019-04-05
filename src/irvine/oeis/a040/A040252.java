package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040252 Continued fraction for sqrt(269).
 * @author Georg Fischer
 */
public class A040252 extends PrependSequence {

  /** Construct the sequence. */
  public A040252() {
    super(new PeriodicSequence(2, 2, 32), Z.valueOf(16));
  }
}
