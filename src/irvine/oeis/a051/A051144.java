package irvine.oeis.a051;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a000.A000037;
import irvine.oeis.a013.A013929;

/**
 * A051144 Nonsquarefree nonsquares: each entry has a square factor but is not a perfect square itself.
 * @author Sean A. Irvine
 */
public class A051144 extends IntersectionSequence {

  /** Construct the sequence. */
  public A051144() {
    super(new A013929(), new A000037());
  }
}
