package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040091 Continued fraction for sqrt(102).
 * @author Georg Fischer
 */
public class A040091 extends PrependSequence {

  /** Construct the sequence. */
  public A040091() {
    super(new PeriodicSequence(10, 20), Z.valueOf(10));
  }
}
