package irvine.oeis.a378;

import irvine.math.group.GroupFactory;
import irvine.oeis.a377.A377573;

/**
 * A378276 Cogrowth sequence of the 20-element dicyclic group Dic20 = &lt;S,T | S^5, T^4, STST^3&gt;.
 * @author Sean A. Irvine
 */
public class A378276 extends A377573 {

  /** Construct the sequence. */
  public A378276() {
    super(GroupFactory.createGroup("Dic5"));
  }
}

