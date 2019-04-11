package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040235 Continued fraction for <code>sqrt(251)</code>.
 * @author Georg Fischer
 */
public class A040235 extends PrependSequence {

  /** Construct the sequence. */
  public A040235() {
    super(new PeriodicSequence(1, 5, 2, 1, 2, 2, 15, 2, 2, 1, 2, 5, 1, 30), Z.valueOf(15));
  }
}
