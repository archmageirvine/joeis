package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040080 Continued fraction for <code>sqrt(90)</code>.
 * @author Georg Fischer
 */
public class A040080 extends PrependSequence {

  /** Construct the sequence. */
  public A040080() {
    super(new PeriodicSequence(2, 18), Z.NINE);
  }
}
