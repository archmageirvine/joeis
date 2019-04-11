package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040030 Continued fraction for <code>sqrt(37)</code>.
 * @author Georg Fischer
 */
public class A040030 extends PrependSequence {

  /** Construct the sequence. */
  public A040030() {
    super(new PeriodicSequence(12), Z.valueOf(6));
  }
}
