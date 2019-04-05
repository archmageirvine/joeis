package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040960 Continued fraction for sqrt(992).
 * @author Georg Fischer
 */
public class A040960 extends PrependSequence {

  /** Construct the sequence. */
  public A040960() {
    super(new PeriodicSequence(2, 62), Z.valueOf(31));
  }
}
