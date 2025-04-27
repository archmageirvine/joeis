package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a068.A068340;

/**
 * A077031 Numbers k such that A068340(k)=+/-3.
 * @author Sean A. Irvine
 */
public class A077031 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A077031() {
    super(1, new A068340(), k -> k.abs().equals(Z.THREE));
  }
}
