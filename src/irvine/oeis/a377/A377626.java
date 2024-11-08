package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377626 Cogrowth sequence of the 12-element group A4 = &lt;S,T | S^3, T^2, (ST)^3&gt;.
 * @author Sean A. Irvine
 */
public class A377626 extends A377573 {

  /** Construct the sequence. */
  public A377626() {
    super(GroupFactory.createGroup("A4"));
  }
}

