package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040325 Continued fraction for <code>sqrt(344)</code>.
 * @author Georg Fischer
 */
public class A040325 extends PrependSequence {

  /** Construct the sequence. */
  public A040325() {
    super(new PeriodicSequence(1, 1, 4, 1, 3, 1, 4, 1, 1, 36), Z.valueOf(18));
  }
}
