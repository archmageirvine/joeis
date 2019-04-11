package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040813 Continued fraction for <code>sqrt(843)</code>.
 * @author Georg Fischer
 */
public class A040813 extends PrependSequence {

  /** Construct the sequence. */
  public A040813() {
    super(new PeriodicSequence(29, 58), Z.valueOf(29));
  }
}
