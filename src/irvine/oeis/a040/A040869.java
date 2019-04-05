package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040869 Continued fraction for sqrt(899).
 * @author Georg Fischer
 */
public class A040869 extends PrependSequence {

  /** Construct the sequence. */
  public A040869() {
    super(new PeriodicSequence(1, 58), Z.valueOf(29));
  }
}
