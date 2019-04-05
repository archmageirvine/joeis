package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040212 Continued fraction for sqrt(228).
 * @author Georg Fischer
 */
public class A040212 extends PrependSequence {

  /** Construct the sequence. */
  public A040212() {
    super(new PeriodicSequence(10, 30), Z.valueOf(15));
  }
}
