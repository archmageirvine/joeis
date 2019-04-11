package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040303 Continued fraction for <code>sqrt(321)</code>.
 * @author Georg Fischer
 */
public class A040303 extends PrependSequence {

  /** Construct the sequence. */
  public A040303() {
    super(new PeriodicSequence(1, 10, 1, 34), Z.valueOf(17));
  }
}
