package irvine.oeis.a378;

import irvine.math.group.GroupFactory;
import irvine.oeis.a377.A377573;

/**
 * A378278 Cogrowth sequence of the 20-element Frobenius group Frob20 = &lt;S,T | S^5, T^4, (ST)^4&gt;.
 * @author Sean A. Irvine
 */
public class A378278 extends A377573 {

  /** Construct the sequence. */
  public A378278() {
    super(GroupFactory.createGroup("F5"));
  }
}

