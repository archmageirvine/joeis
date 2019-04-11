package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040875 Continued fraction for <code>sqrt(906)</code>.
 * @author Georg Fischer
 */
public class A040875 extends PrependSequence {

  /** Construct the sequence. */
  public A040875() {
    super(new PeriodicSequence(10, 60), Z.valueOf(30));
  }
}
