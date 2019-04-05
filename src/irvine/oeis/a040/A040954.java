package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040954 Continued fraction for sqrt(986).
 * @author Georg Fischer
 */
public class A040954 extends PrependSequence {

  /** Construct the sequence. */
  public A040954() {
    super(new PeriodicSequence(2, 2, 62), Z.valueOf(31));
  }
}
