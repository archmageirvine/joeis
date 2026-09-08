package irvine.oeis.a324;

import irvine.oeis.DirectSequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A324536 a(n) = A324542(A002110(n)).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A324536 extends SimpleTransformSequence {

  private static final DirectSequence A324542 = new A324542();

  /** Construct the sequence. */
  public A324536() {
    super(0, new A002110(), A324542::a);
  }
}
