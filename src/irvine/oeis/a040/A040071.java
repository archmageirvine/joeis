package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040071 Continued fraction for <code>sqrt(80)</code>.
 * @author Georg Fischer
 */
public class A040071 extends PrependSequence {

  /** Construct the sequence. */
  public A040071() {
    super(new PeriodicSequence(1, 16), Z.EIGHT);
  }
}
