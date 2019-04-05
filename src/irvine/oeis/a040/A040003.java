package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040003 Continued fraction for sqrt(6).
 * @author Georg Fischer
 */
public class A040003 extends PrependSequence {

  /** Construct the sequence. */
  public A040003() {
    super(new PeriodicSequence(2, 4), Z.valueOf(2));
  }
}
