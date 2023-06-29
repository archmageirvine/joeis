package irvine.oeis.a061;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a010.A010051;

/**
 * A061007 a(n) = -(n-1)! mod n.
 * @author Sean A. Irvine
 */
public class A061007 extends PrependSequence {

  /** Construct the sequence. */
  public A061007() {
    super(1, new SkipSequence(new A010051(), 4), 0, 1, 1, 2);
  }
}
