package irvine.oeis.a387;

import irvine.oeis.MultiplicativeSequence;
import irvine.oeis.a005.A005812;

/**
 * A387942 allocated for C. S. Davis.
 * @author Sean A. Irvine
 */
public class A387942 extends MultiplicativeSequence {

  private static final A005812 SEQ = new A005812();

  /** Construct the sequence. */
  public A387942() {
    super(1, (p, e) -> SEQ.a(p).pow(e));
  }
}
