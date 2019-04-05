package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040024 Continued fraction for sqrt(30).
 * @author Georg Fischer
 */
public class A040024 extends PrependSequence {

  /** Construct the sequence. */
  public A040024() {
    super(new PeriodicSequence(2, 10), Z.valueOf(5));
  }
}
