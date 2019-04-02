package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A110118 a(n) = floor(n*(sqrt(6) + sqrt(2) + 2)/4).
 * @author Sean A. Irvine
 */
public class A110118 extends ComplementSequence {

  /** Construct the sequence. */
  public A110118() {
    super(new A110117(), Z.ONE);
  }
}
