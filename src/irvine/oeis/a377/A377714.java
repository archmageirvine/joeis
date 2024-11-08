package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377714 Cogrowth sequence for the 8-element group C4 x C2 = &lt;S,T | S^4, T^2, [S,T]&gt;.
 * @author Sean A. Irvine
 */
public class A377714 extends A377573 {

  /** Construct the sequence. */
  public A377714() {
    super(GroupFactory.createGroup("C2xC4"), 2, 0);
  }
}

