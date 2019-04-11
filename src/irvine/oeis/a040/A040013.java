package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040013 Continued fraction for <code>sqrt(18)</code>.
 * @author Georg Fischer
 */
public class A040013 extends PrependSequence {

  /** Construct the sequence. */
  public A040013() {
    super(new PeriodicSequence(4, 8), Z.valueOf(4));
  }
}
