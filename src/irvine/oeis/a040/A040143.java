package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040143 Continued fraction for sqrt(156).
 * @author Georg Fischer
 */
public class A040143 extends PrependSequence {

  /** Construct the sequence. */
  public A040143() {
    super(new PeriodicSequence(2, 24), Z.valueOf(12));
  }
}
