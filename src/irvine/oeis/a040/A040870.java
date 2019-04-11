package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040870 Continued fraction for <code>sqrt(901)</code>.
 * @author Georg Fischer
 */
public class A040870 extends PrependSequence {

  /** Construct the sequence. */
  public A040870() {
    super(new PeriodicSequence(60), Z.valueOf(30));
  }
}
