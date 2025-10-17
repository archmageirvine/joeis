package irvine.oeis.a386;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a080.A080259;
import irvine.oeis.a332.A332785;

/**
 * A386294 Nonsquarefree weak numbers k such that A053669(k) &lt; A006530(k).
 * @author Sean A. Irvine
 */
public class A386294 extends IntersectionSequence {

  /** Construct the sequence. */
  public A386294() {
    super(1, new A332785(), new A080259());
  }
}
