package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040131 Continued fraction for sqrt(143).
 * @author Georg Fischer
 */
public class A040131 extends PrependSequence {

  /** Construct the sequence. */
  public A040131() {
    super(new PeriodicSequence(1, 22), Z.valueOf(11));
  }
}
