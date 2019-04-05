package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040059 Continued fraction for sqrt(68).
 * @author Georg Fischer
 */
public class A040059 extends PrependSequence {

  /** Construct the sequence. */
  public A040059() {
    super(new PeriodicSequence(4, 16), Z.valueOf(8));
  }
}
