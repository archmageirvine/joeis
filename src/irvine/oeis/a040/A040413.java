package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040413 Continued fraction for sqrt(434).
 * @author Georg Fischer
 */
public class A040413 extends PrependSequence {

  /** Construct the sequence. */
  public A040413() {
    super(new PeriodicSequence(1, 4, 1, 40), Z.valueOf(20));
  }
}
