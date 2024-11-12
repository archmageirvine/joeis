package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377855 Cogrowth sequence of the 16-element group C4:C4 = &lt;S,T | S^4, T^4, STST^3&gt;.
 * @author Sean A. Irvine
 */
public class A377855 extends A377573 {

  /** Construct the sequence. */
  public A377855() {
    super(GroupFactory.createGroup("C4:C4"), 2, 0);
  }
}

