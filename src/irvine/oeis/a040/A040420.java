package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040420 Continued fraction for sqrt(442).
 * @author Georg Fischer
 */
public class A040420 extends PrependSequence {

  /** Construct the sequence. */
  public A040420() {
    super(new PeriodicSequence(42), Z.valueOf(21));
  }
}
