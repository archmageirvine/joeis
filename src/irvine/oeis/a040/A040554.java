package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040554 Continued fraction for sqrt(579).
 * @author Georg Fischer
 */
public class A040554 extends PrependSequence {

  /** Construct the sequence. */
  public A040554() {
    super(new PeriodicSequence(16, 48), Z.valueOf(24));
  }
}
