package irvine.oeis.a044;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a038.A038392;

/**
 * A044045 Same as A038392 except for initial term.
 * @author Sean A. Irvine
 */
public class A044045 extends PrependSequence {

  /** Construct the sequence. */
  public A044045() {
    super(new A038392().skip(1), Z.ZERO);
  }
}

