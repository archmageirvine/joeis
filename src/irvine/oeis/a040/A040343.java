package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040343 Continued fraction for sqrt(363).
 * @author Georg Fischer
 */
public class A040343 extends PrependSequence {

  /** Construct the sequence. */
  public A040343() {
    super(new PeriodicSequence(19, 38), Z.valueOf(19));
  }
}
