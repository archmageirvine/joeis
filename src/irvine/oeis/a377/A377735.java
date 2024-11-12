package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377735 Cogrowth sequence of the 16-element group Q8 X C2 = &lt;S,T,U | S^4, T^4, U^2, STS^3T, S^2U^2, [S,U], [T,U]&gt;.
 * @author Sean A. Irvine
 */
public class A377735 extends A377573 {

  /** Construct the sequence. */
  public A377735() {
    super(GroupFactory.createGroup("C2xQ8"), 2, 0);
  }
}

