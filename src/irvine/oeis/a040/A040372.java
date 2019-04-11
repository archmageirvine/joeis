package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040372 Continued fraction for <code>sqrt(392)</code>.
 * @author Georg Fischer
 */
public class A040372 extends PrependSequence {

  /** Construct the sequence. */
  public A040372() {
    super(new PeriodicSequence(1, 3, 1, 38), Z.valueOf(19));
  }
}
