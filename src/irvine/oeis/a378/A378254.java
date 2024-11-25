package irvine.oeis.a378;

import irvine.math.group.GroupFactory;
import irvine.oeis.a377.A377573;

/**
 * A378254 Cogrowth sequence of the 20-element group C10 X C2 = &lt;S,T | S^10, T^2, [S,T]&gt;.
 * @author Sean A. Irvine
 */
public class A378254 extends A377573 {

  /** Construct the sequence. */
  public A378254() {
    super(GroupFactory.createGroup("C2xC10"), 2, 0);
  }
}

