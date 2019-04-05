package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040609 Continued fraction for sqrt(635).
 * @author Georg Fischer
 */
public class A040609 extends PrependSequence {

  /** Construct the sequence. */
  public A040609() {
    super(new PeriodicSequence(5, 50), Z.valueOf(25));
  }
}
