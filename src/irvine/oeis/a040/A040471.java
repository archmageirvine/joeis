package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040471 Continued fraction for sqrt(494).
 * @author Georg Fischer
 */
public class A040471 extends PrependSequence {

  /** Construct the sequence. */
  public A040471() {
    super(new PeriodicSequence(4, 2, 2, 1, 2, 1, 2, 2, 4, 44), Z.valueOf(22));
  }
}
