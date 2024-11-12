package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377840 Cogrowth sequence of the 16-element group C8 X C2 = &lt;S,T | S^8, T^2, [S,T]&gt;.
 * @author Sean A. Irvine
 */
public class A377840 extends A377573 {

  /** Construct the sequence. */
  public A377840() {
    super(GroupFactory.createGroup("C2xC8"), 2, 0);
  }
}

