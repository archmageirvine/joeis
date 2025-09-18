package irvine.oeis.a387;

import irvine.oeis.UnionSequence;
import irvine.oeis.a014.A014574;
import irvine.oeis.a088.A088763;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A387935 extends UnionSequence {

  /** Construct the sequence. */
  public A387935() {
    super(new A014574(), new A088763());
  }
}
