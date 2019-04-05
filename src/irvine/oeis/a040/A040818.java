package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040818 Continued fraction for sqrt(848).
 * @author Georg Fischer
 */
public class A040818 extends PrependSequence {

  /** Construct the sequence. */
  public A040818() {
    super(new PeriodicSequence(8, 3, 3, 3, 8, 58), Z.valueOf(29));
  }
}
