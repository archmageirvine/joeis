package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040029 Continued fraction for sqrt(35).
 * @author Georg Fischer
 */
public class A040029 extends PrependSequence {

  /** Construct the sequence. */
  public A040029() {
    super(new PeriodicSequence(1, 10), Z.valueOf(5));
  }
}
