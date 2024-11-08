package irvine.oeis.a377;

import irvine.math.group.GroupFactory;

/**
 * A377656 Cogrowth sequence of the 12-element dicyclic group Dic12 = &lt;S,T | S^6, T^4, STST^3, S^3T^2&gt;.
 * @author Sean A. Irvine
 */
public class A377656 extends A377573 {

  /** Construct the sequence. */
  public A377656() {
    super(GroupFactory.createGroup("Dic3"));
  }
}

