package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040701 Continued fraction for sqrt(728).
 * @author Georg Fischer
 */
public class A040701 extends PrependSequence {

  /** Construct the sequence. */
  public A040701() {
    super(new PeriodicSequence(1, 52), Z.valueOf(26));
  }
}
