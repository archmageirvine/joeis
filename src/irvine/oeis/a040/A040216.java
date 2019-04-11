package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040216 Continued fraction for <code>sqrt(232)</code>.
 * @author Georg Fischer
 */
public class A040216 extends PrependSequence {

  /** Construct the sequence. */
  public A040216() {
    super(new PeriodicSequence(4, 3, 7, 3, 4, 30), Z.valueOf(15));
  }
}
