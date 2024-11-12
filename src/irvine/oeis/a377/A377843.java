package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377843 Cogrowth sequence of the 16-element group C4 X C2 X C2 = &lt;S,T,U | S^4, T^2, U^2, [S,T], [S,U], [T,U]&gt;.
 * @author Sean A. Irvine
 */
public class A377843 extends A377573 {

  /** Construct the sequence. */
  public A377843() {
    super(GroupFactory.createGroup("C2^2xC4"), 2, 0);
  }
}

