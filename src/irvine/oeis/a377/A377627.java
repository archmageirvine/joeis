package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377627 Cogrowth sequence of the 12-element group C6 x C2 = &lt;S,T | S^6, T^2, [S,T]&gt;.
 * @author Sean A. Irvine
 */
public class A377627 extends A377573 {

  /** Construct the sequence. */
  public A377627() {
    super(GroupFactory.createGroup("C2xC6"), 2, 0);
  }
}

