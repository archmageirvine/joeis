package irvine.oeis.a068;

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068195 Numbers of the form n(n+1)/2 whose only representation as a sum of 2 or more consecutive positive integers is 1+2+...+n.
 * @author Sean A. Irvine
 */
public class A068195 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068195() {
    super(1, new A068194(), k -> k.multiply(k.add(1)).divide2());
  }
}
