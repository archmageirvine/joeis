package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040604 Continued fraction for sqrt(630).
 * @author Georg Fischer
 */
public class A040604 extends PrependSequence {

  /** Construct the sequence. */
  public A040604() {
    super(new PeriodicSequence(10, 50), Z.valueOf(25));
  }
}
