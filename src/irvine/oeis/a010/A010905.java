package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010905 Pisot sequence E(4,15): <code>a(n) = floor(a(n-1)^2/a(n-2)+1/2)</code> for <code>n&gt;1, a(0)=4, a(1)=15</code>.
 * @author Sean A. Irvine
 */
public class A010905 extends PisotSequence {

  /** Construct the sequence. */
  public A010905() {
    super(4, 15);
  }
}

