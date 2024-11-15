package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377943 Cogrowth sequence of the 16-element Pauli group C4 o D4 = &lt;S,T,U | s^4, T^2, U^2, S^2(TU)^2, [S,T], [S,U]&gt;.
 * @author Sean A. Irvine
 */
public class A377943 extends A377573 {

  /** Construct the sequence. */
  public A377943() {
    super(GroupFactory.createGroup("C4oD4"), 2, 0);
  }
}

