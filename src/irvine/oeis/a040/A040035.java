package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040035 Continued fraction for <code>sqrt(42)</code>.
 * @author Georg Fischer
 */
public class A040035 extends PrependSequence {

  /** Construct the sequence. */
  public A040035() {
    super(new PeriodicSequence(2, 12), Z.valueOf(6));
  }
}
