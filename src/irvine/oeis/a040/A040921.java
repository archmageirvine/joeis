package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040921 Continued fraction for sqrt(952).
 * @author Georg Fischer
 */
public class A040921 extends PrependSequence {

  /** Construct the sequence. */
  public A040921() {
    super(new PeriodicSequence(1, 5, 1, 6, 1, 5, 1, 60), Z.valueOf(30));
  }
}
