package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040207 Continued fraction for sqrt(222).
 * @author Georg Fischer
 */
public class A040207 extends PrependSequence {

  /** Construct the sequence. */
  public A040207() {
    super(new PeriodicSequence(1, 8, 1, 28), Z.valueOf(14));
  }
}
