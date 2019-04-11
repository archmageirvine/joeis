package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040662 Continued fraction for <code>sqrt(689)</code>.
 * @author Georg Fischer
 */
public class A040662 extends PrependSequence {

  /** Construct the sequence. */
  public A040662() {
    super(new PeriodicSequence(4, 52), Z.valueOf(26));
  }
}
