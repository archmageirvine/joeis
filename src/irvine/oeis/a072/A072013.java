package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A072013 Numbers k such that A072012(k) = k.
 * @author Sean A. Irvine
 */
public class A072013 extends FilterSequence {

  /** Construct the sequence. */
  public A072013() {
    super(1, new A072012(), (n, k) -> k.equals(Z.valueOf(n)));
  }
}
