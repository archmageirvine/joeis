package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040353 Continued fraction for <code>sqrt(373)</code>.
 * @author Georg Fischer
 */
public class A040353 extends PrependSequence {

  /** Construct the sequence. */
  public A040353() {
    super(new PeriodicSequence(3, 5, 5, 3, 38), Z.valueOf(19));
  }
}
