package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040674 Continued fraction for <code>sqrt(701)</code>.
 * @author Georg Fischer
 */
public class A040674 extends PrependSequence {

  /** Construct the sequence. */
  public A040674() {
    super(new PeriodicSequence(2, 10, 10, 2, 52), Z.valueOf(26));
  }
}
