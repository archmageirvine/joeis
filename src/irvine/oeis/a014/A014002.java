package irvine.oeis.a014;

import irvine.oeis.PisotSequence;

/**
 * A014002 Pisot sequence E(8,14), a(n)=[ a(n-1)^2/a(n-2)+1/2 ].
 * @author Sean A. Irvine
 */
public class A014002 extends PisotSequence {

  /** Construct the sequence. */
  public A014002() {
    super(8, 14);
  }
}

