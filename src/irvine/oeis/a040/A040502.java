package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040502 Continued fraction for sqrt(525).
 * @author Georg Fischer
 */
public class A040502 extends PrependSequence {

  /** Construct the sequence. */
  public A040502() {
    super(new PeriodicSequence(1, 10, 2, 10, 1, 44), Z.valueOf(22));
  }
}
