package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A072011 extends FilterSequence {

  /** Construct the sequence. */
  public A072011() {
    super(1, new A072010(), (n, k) -> k.equals(Z.valueOf(n)));
  }
}
