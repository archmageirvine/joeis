package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040157 Continued fraction for <code>sqrt(171)</code>.
 * @author Georg Fischer
 */
public class A040157 extends PrependSequence {

  /** Construct the sequence. */
  public A040157() {
    super(new PeriodicSequence(13, 26), Z.valueOf(13));
  }
}
