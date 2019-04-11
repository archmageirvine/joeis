package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040618 Continued fraction for <code>sqrt(644)</code>.
 * @author Georg Fischer
 */
public class A040618 extends PrependSequence {

  /** Construct the sequence. */
  public A040618() {
    super(new PeriodicSequence(2, 1, 1, 1, 6, 1, 1, 1, 2, 50), Z.valueOf(25));
  }
}
