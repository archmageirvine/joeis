package irvine.oeis.a022;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006520;

/**
 * A022560 a(0)=0, a(2*n) = 2*a(n) + 2*a(n-1) + n^2 + n, a(2*n+1) = 4*a(n) + (n+1)^2.
 * @author Sean A. Irvine
 */
public class A022560 extends PartialSumSequence {

  /** Construct the sequence. */
  public A022560() {
    super(new PrependSequence(new A006520(), 0));
  }
}

