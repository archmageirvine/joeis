package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040965 Continued fraction for <code>sqrt(997)</code>.
 * @author Georg Fischer
 */
public class A040965 extends PrependSequence {

  /** Construct the sequence. */
  public A040965() {
    super(new PeriodicSequence(1, 1, 2, 1, 4, 1, 1, 4, 1, 2, 1, 1, 62), Z.valueOf(31));
  }
}
