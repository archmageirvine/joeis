package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a061.A061233;

/**
 * A014014 Alternating Engel expansion of <code>Pi</code>.
 * @author Sean A. Irvine
 */
public class A014014 extends PrependSequence {

  /** Construct the sequence. */
  public A014014() {
    super(new SkipSequence(new A061233(), 1), Z.THREE);
  }
}
