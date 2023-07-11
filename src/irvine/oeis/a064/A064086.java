package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A064086 Condensed version of A064085: all terms of A064085 with values greater than 1 (which coincides with all terms of A064085 with nonprime power index).
 * @author Sean A. Irvine
 */
public class A064086 extends FilterSequence {

  /** Construct the sequence. */
  public A064086() {
    super(1, new A064085(), k -> k.compareTo(Z.ONE) > 0);
  }
}
