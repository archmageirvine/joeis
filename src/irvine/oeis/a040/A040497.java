package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040497 Continued fraction for sqrt(520).
 * @author Georg Fischer
 */
public class A040497 extends PrependSequence {

  /** Construct the sequence. */
  public A040497() {
    super(new PeriodicSequence(1, 4, 11, 4, 1, 44), Z.valueOf(22));
  }
}
